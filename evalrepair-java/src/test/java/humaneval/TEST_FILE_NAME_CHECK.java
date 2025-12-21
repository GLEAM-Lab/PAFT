package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_FILE_NAME_CHECK {
    @org.junit.Test(timeout = 3000)
    public void test() throws java.lang.Exception {
        String[] inputs = new String[] {
            "/this_is_valid.dll", "this_is_valid.wow", "this_is_valid.txt", "this_is_valid.txtexe", "#this2_i4s_5valid.ten", "@this1_is6_valid.exe",
            "this_is_12valid.6exe4.txt", "all.exe.txt", "I563_No.exe", "Is3youfault.txt", "no_one#knows.dll", "1I563_Yes3.exe",
            "I563_Yes3.txtt", "final..txt", "final132", "_f4indsartal132."
        };
        String[] outputs = new String[] {
            "No", "No", "Yes", "No", "No", "No",
            "No", "No", "Yes", "Yes", "Yes", "No",
            "No", "No", "No", "No"
        };
        for (int i = 0; i < inputs.length; i += 1){
            String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(inputs[i]);
            org.junit.Assert.assertEquals(
                result, outputs[i]
            );
        }
    }
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("example.txt");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1example.dll");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("s1sdf3.asd");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("K.dll");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("MY16FILE3.exe");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("His12FILE94.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("_Y.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("?aREYA.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("/this_is_valid.dll");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("this_is_valid.wow");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("this_is_valid.txt");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_11() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("this_is_valid.txtexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("#this2_i4s_5valid.ten");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_13() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("@this1_is6_valid.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("this_is_12valid.6exe4.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_15() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("all.exe.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I563_No.exe");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("Is3youfault.txt");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("no_one#knows.dll");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1I563_Yes3.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_20() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I563_Yes3.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("final..txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("final132");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("_f4indsartal132.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("s.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("example.py");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("my.docx");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("hello world.exe");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alice.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abc123def.exe");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1script.bat");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("validfile.txt");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_35() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("file.doc");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("heello world.exe");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ffile.docile.doc");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exalice.12123.txt3.xtxte");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exalice.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exmy.docx");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("fle.doc");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1script.batt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exalic1script.bate.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exalice.123..exalice.123.tx.t");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("my.dcx");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exmy.docx.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("..ex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abc123defexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("hello world.exe.exmy.docx.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alice.123.taxt.i.ex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcheello world.exe123defexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("heell.exalice.12123.txt3.xtxteo world.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exalice.12123.ex.txt3.xtxt.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("filc");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alice.123.i.ex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".e.ex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exal.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("123.ttxt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".efile.doc.ex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1script.ba.exet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alice.123.i.1script.batex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exali123.ttxtc1script.bate.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alice.123.i.exalice.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("hello world1script.bat.exe.exmy.docx.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alice.exali123.ttxtc1script.bate.123.txt.123.i.ex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".efile.dex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alice.l12l3.i.exalice.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".efil.exal.123.txte.dex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("validftile.txt");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1script.ba.eexert");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("hello world1script.bat.exe.exmy.docx.exealice.12i.ex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exmy.docx.efil.exal.123.txte.dex.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("hehello world.exe.exmy.docx.exello world.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1script.ba.xet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exali123.ttxtc1script.bate.123.tx.efil.exal.123.txte.dext");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exali123.ttxtc1script.bate.123.tx.efil.exal.123.txte.defile.docxt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("FX");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".heello world.exeexalice.123..exalice.123.tx.t");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alice.123.i.exalice..123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("file.dolc");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("hehello world.exe.exmy.docx.exelwlo world.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exalict1script.bate.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("....ex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("validfilve.txtFX");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exali123.ttxtc1script.bate.123.tx.efil.exal.123.txte.dex.exm1y.docxt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("....e.eexx");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("mhello world.exe.exmy.docx.exey.dcx");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("valfile.txit");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alicealice.exali123.ttxtc1script.bate.123.txt.123.i.ex.l12l3.i.exalice.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eex1script.ba.exet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alice.l12validfile.txtl3.i.exalice.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("...ex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eeex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exmy.docx.FXexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exali123.ttxtc1sc..exript.bate.123.tx.efil.exal.123.txte.dext");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("hello worl.d.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("....e.eeheell.exalice.12123.txt3.xtxteo world.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcheelrld.exe123defexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alice.l12validfile.txtlalice.exali123.ttxtc1script.bate.123.txt.123.i.ex3.i.exalice.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exali123.ttxtc1scriptt.bate.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".heello world.exheell.exalice.12123.txt3.xtxteo world.exeeexalice.123..exalice.123.tx.t");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exalice.12121232d.efexexte");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exalice.l12validfile.txtl3.i.exalice.123.txtal.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exalice.l12validfile.txtl3.i.my.docx");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exhello worl.d.exealic1script.batFXe.12.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exmya.docx.efil.emy.docxxal.123.txte.dex.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exali123c.ttxtc1script.bate.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exali123alice.exali123.ttxtc1script.bate.123.txt.123.i.exc.ttxabc123defexetc1script.bate.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alice.l12validflile.txtl3.i.exalice.123.ttxt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1script.batt.exalic1script.bate.123.t");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".e.exali123.ttxtc1script.bate.123.tx.efil.exal.123.txte.dextfile.doc.ex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exalice.12123.txxtxte");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1script.bai.exet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exa.exalice.12123.txt3.xtxteli123.ttxtc1scriptt.bate.123.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ffile.d.efile.doc.exocile.doc");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("validfilalice.l12validflile.txtl3.i.exalice.123.ttxte.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".efil.exal.validftile.txt123.txte.dex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exalice.123.txt.exalice.123..exalice.123.tx.t");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exal.123my.docx.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".efile.dxoc.ex");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exmy.docx.FX1script.ba.exetexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits1234567890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("example.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".example");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("example");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("123.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_digits_or_dots");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("Qflg");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examQflgple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcd.x.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exam123.exeple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_n_dots");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcd.x.txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctxatt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.example");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_digits_or_dotsalreadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadyexists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcd.x.txtt.tx.to.I_have_no_digits_or_dots");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exampleigits_or_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("Qalreadyexists.txzflg");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctxI_have_no_de.exampleigits_or_do_tsatt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exampltherearemorethan3digits1234567890inthisnamae.exeeigits_or_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alralreadyexists.txzeadyexists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.exampleabctxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_digits_Qalreadyexists.txzflgor_dotsalreQflgists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctxI_have_no_de.exampleigits_or_do_I_have_no_de.exampltherearemorethaen3digits1234567890inthisnamae.exeeigits_or_tstsatt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("léxample.exe");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("T");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ab1.exam123.exeple23.exetxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcd.ctxxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_n_dotsyexists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exaampltherearemorethan3digits1234567890inthisnamae.exeeigits_or_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_165() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abct");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctxéxample.exett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits1.tx.to.234567890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_n_dos");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examlplI_have_n_dose.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("lQflg");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("123.I_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_tsexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_mno_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits1.tx.to.23456123.exe7890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tes");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxample.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("Q");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ee.example");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exam123.exeplee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcd.x.txtt.tx.to.I_have_no_digits_or_dotsbct");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_éxample.exaeno_digits_or_dotsalreadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examlplexample._have_n_dose.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".3.exeeplee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".3.exeeplabcd.ctxxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exaem123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQflgpleam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_186() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tes");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("CFP");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.examplctxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examlplexample._have_n_dose.I_have_no_digits_Qalreadyexists.txzflgor_dotsalreQflgists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_teslg");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattempleigits_or_do_teslg");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits1.tx.toabct.23456123.exe7890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("example.T");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_éxample.exaeno_digits_or_dotsalreadyexists.txzQ");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.3.exeeplee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcd.ctxxtherearemorethan3digits1.tx.to.234567890inthisname.exett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_digits_or_dotsaltreadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctxxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_199() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxtherearemorethan3digits12345123.exe67890inthiisname.exeample.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.Qalreadyexists.txzf1.exam123.exmpleigits_or_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exam123.exeple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exe.examplctxttaem123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exam123.exepleeexample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemoreI_have_n_dotsthan3digits1234567890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcd.xI_have_no_digits_or_dotsbct");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.3.exeepleeabcd.xt.txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_teslg3.exeepleeabcd.xt.txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxampl1.exaem123.exeple23.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("oI_have_no_digits_or_dots");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQ");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_digits_Qalreadyexists.txzflgor_dotsalreQzflgists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_ists.example.txzee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("CF");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlave_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_219() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tesflgpleam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alralreadyexists.txzeadyexiI_have_n_dotssts.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQflgpleam123.exeple23.exeabctxatt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits1.tx.to.23456i7890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.3.exeepleealralreadyexists.txzeadyexiI_have_n_dotssts.example.txzabcd.xt.txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQflg3.exeeplee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("eealreadI_hlave_ists.example.txzxample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".3.exeeplabcd.ctp.lQflg3.exeepleexxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemexample.Torethan3digits1.tx.to.23456i7890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abI_have_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQct");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examlplexample._have_n_dose.I_have_no_digits_Qalreadyexists.txzflgor_dotsalreQflgists.txnz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.examplleabctxtee.examplet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exampleigits_or_I_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctxxttdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQflgpleam123.exepltherearemorethan3digits1.tx.to.23456i7890inthisname.exee23.exeabctxatt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exmple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctxéxeealreadI_hlave_ists.example.txzxampleample.exett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ab1.exam123.exeple23.exetxett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exam12.tx.to.xepl");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.123.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exmmple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_239() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctI_have_n_dotsxI_have_no_de.exampleigits_or_do_tsatt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_dde.exampleigits_or_I_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctxxttdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_n_dotsyexists.example.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.QalreadyabctxI_havex_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tes");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_n_dotsyexists.exam1.exexamQI_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tesflgpleam123.exeple23.exeple.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("thaabcd.x.txtt.tx.to.I_have_no_digits_or_dotsbcterearemorethan3digits1234567890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_245() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits123456890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examplee.exampleabctxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alralreadyexists.txzeadyexiexample.sts.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits1.tx.to.23456789r0inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exaem123.exeple23.exee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("atbcd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_mno_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigitsalreadI_have_ists.example.txz_or_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeplee23.exempleigits_or_do_tesflgpleam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlavtherearemorethan3digits123456890inthisnamep.3.exeepleeabcd.xt.txtt.tx.to..exee_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_haabctxI_have_no_de.exampleigits_or_do_tsattve_no_digits_Qalreadyexists.txzflgor_dotsalreQzflgists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exampleealreadI_hlave_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa1mpl1.exaem123.exeple23.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealrep.3.exeepleeabcd.xt.txtt.tx.to.adI_hlave_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exaem123.exeple2ee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exam");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("mple.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlave_ists.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.ample.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("NVPsZuOM");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".3.exeeplabcd.ctp.lQflp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.g3.exeepleexxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alralreadyexists.txzeadyexistabctxI_have_no_de.exampleigits_or_do_tsatts.example.p.3.exeepleez");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_n_dotsyexists.example.txI_have_no_de.exampleigits_or_do_tsvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".3.exeeplabcd.ctp.lQflp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txQalreadyexists.txzflgzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.g3.exeepleexxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("Qflgexmple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_n_dotsyexistsI_have_éxample.exaeno_digits_or_dotsalreadyexists.txz.example.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits1.tx.toabct.234alralreadyexists.txzeadyexiexample.sts.example.txz56123.exe7890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxampl1.exaem123abI_have_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQct.exeple23.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_n_dotsyeCFxists.example.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exa123.exeple23.exempleigits_or_do_tes");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQflgpl123.exeeam123.exepltherearemorethan3digits1.tx.to.23456i7890inthisname.exee23.exeabctxatt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_digits_Qalreadyexixsts.txzflgor_dotsalreQflgists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_276() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctxéxaoI_have_no_digits_or_dotsmple.exett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exampleigits_or_I_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctabctxéxample.exettxxttdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_nao_de.Qalream123.exeplee23.exempleigits_or_do_tesflgpleam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digealreadI_hlave_ists.example.txzits1234567890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exam123.e2xeple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits1.tx.to.23456123.exe7890inthisnameabcd.ctxxttexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxample.e.3.exeeplabcd.ctp.lQflg3.exeepleexxttxae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlave_ists.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalrieadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.ample.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxample.e.3.exeeplI_have_éxample.exaeno_digits_or_dotsalreadyexists.txzQabcd.ctp.lQflg3.exeepleexxttxae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_285() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have.tx.to._ists.ep.3.exeepleexample.txzee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exam112.tx.to.xepl");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no__or_dotsaltreadyexistsexample..txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadyexists.exampp.3.exeepleetxz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.3.exeepleeabcd.xto.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethant3digits1.tx.to.234567890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemoreethan3digits123456890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alralereadyexists.txzeadyexistabctxI_have_no_de.exampleigits_or_do_tsatts.example.p.3.exeepleez");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexp.lQflg3.exeepleeis1ts.txzf1.exam123.exeple23.exempleigits_or_dos");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxample.pexaae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.QalreadyabctxI_havex_no_de.exampleigits__or_do_tsattexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tes");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exe.examplctxttaem123.exeple23xe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exaem123..exeple2ee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcQalreadyexists.ttxzflxgt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.examplleabctxtee.extherearemorethan3digits1.tx.to.23456i7890inthisname.exeamplet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("eealreadI_hlave_iststxzxample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".tabctxéxample.exettxexamlplexample._have_n_dose..to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.3.exeepleealralreadyexists.txzeadyexiI_have_n_dotssts.example.txzabcde.exampleabctxtt.xt.txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_havab1.exam123.exeple23.exetxette_ists.example.txzee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxample.e.3.exeeplabcd.ctp.lQflg3.exeepleexxttxaeF");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_n_dotsyexists.exoample.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tesflgplea1.exaem123.exeple2eem123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".examplempmle.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examplee.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_mno_de.Qalreadyexists.txzf1.exam123.exeple23.exemplehigitsalr_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.3.eI_have_mno_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigitsalreadI_have_ists.example.txz_or_do_tsxeeplee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcttxéxample.exett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlave_ists.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigitsexamplee._or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits1.tx.to.234561eabcd.ctxxttexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("at");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlave_ists.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.etherearemorethan3digits1.tx.toabct.23456123.exe7890inthisname.exexampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.ample.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examxm123.exeple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlave_ists.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.ethefrearemorethan3digits1.tx.toabct.23456123.exe7890inthisname.exexampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.ample.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exampleigits_or_I_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctxxdttdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemrorethan3digits1.tx.to.234561eabcd.ctxxttexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlavthe.tabctxéxample.exettxexamlplexample._have_n_dose..to.rearemorethan3digits123456890inthisnamep.3.exeepleeabcd.xt.txtt.tx.to..exee_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exap.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to..T");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("atat");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examlplexa.3.exeeplabcd.ctp.lQflg3.exeepleexxttle._have_n_dose.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".3.e123.exexeeplabcd.ctp.eexxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_325() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alQfllgtbcd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_ists.example.txe.examplez");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.examplleabctxtee.exthere.aremorethan3diabctxttname.exeamplet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.exampl");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exe.examplctxttaem123.etherearemorethan3digits1234567890inthisname.exexeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("NVZuOMM.3.exeeplee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exampltherearemorethaéxampl1.exaem123abI_have_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQct.exeple23.exee.exaen3digits1234567890inthisnamae.exeeigits_or_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examexamxm123.exeple.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxampl1.exaem123abI_hCFave_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQct.exeple23.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.QalreadyabctxI_havex_no_de.exampleigits__or_do_tsattexis1ts.txzf1.exam123.exeple23.exemplei1.exe.examplctxttaem123.exeple23.exegits_or_do_tes");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("oI__have_no_digits_or_dots");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_dtigits_Qalreadyexists.txzflgor_dotsalreQzflgists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exampleigits_or_I_have_no_de.Qalreadyexists.txzf1.exam123example..exeple23.exempleigits_or_do_ts.3.exI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_teseeplabcd.ctxxttdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.exa");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ab");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadyyexists.exampp.3.exeepleetxz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.examlplexample._have_n_dose.I_have_no_digits_Qalreadyexists.txzflgor_dotsalreQflgists.txzexexamQI_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeplee23.exempleigits_or_do_tesflgpleam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exaaTmpltherearemorethan3digits1234567890inthisnamae.exeeigits_or_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlave_ists.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.eexample.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.ample.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("eaalreadI_hlave_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_atatn_dotsyexists.exoample.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exedple23.exempleigits_or_do_teslg3.exeepleeabcd.xt.txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_347() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxample.e.3.exeepltherearemorethan3digits1.tx.to.23456789r0inthisname.exe_digitI_have_no_de.QalreadyabctxI_havex_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tess_or_dotsalreadyexists.txzQabcd.ctp.lQflg3.exeepleexxttxae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ab1.exam123.exeple23.exeett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_iists.example.txzee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ots");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("bab");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemoreI_have_n_dotsthan3digits1234567890inthisnamabctxI_have_no_de.exampleigits_or_do_I_have_no_de.exampltherearemorethaen3digits1234567890inthisnamae.exeeigits_or_tstsatte");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_hQave_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxampl1.exaeam123abI_hCFave_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQct.exeple23.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzfe1.I_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctxxttpexam123.exeple23.exempleigits_ores");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".examalreadI_have_n_dotsyexists.example.txz123.e2xeple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alrea.exam123.e2xeples.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeplee23.exempleigits_or_d.3.exeeplabcd.ctp.lQflp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeplQe23.exempleigits_or_do_txtt.tx.to.g3.exeepleexxtto_tesflgpleam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tesflgplea1.exaem123.exeple2eem123.exI_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_teseple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcd.x.txtt.txe.to.I_have_no_digits_or_dots");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcd.x.txtt.tx.to.I_alreadyyexists.exampp.3.exeepleetxzhav_doct");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exampltherearemorethaéxampl1.exaem123abI_have_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexistealrep.3.exeepleeabcd.xt.txtt.tx.to.adI_hlave_ists.example.txzs.txzQct.exeple23.exee.exaen3digits1234567890inthisnamae.exeeigits_or_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_363() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_mno_de.Qalreab1.exam123.exeple23.exetxttadyexists.txzf1.exam123.exeple23.exemplehigitsalr_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxampl1.exaeam123abI_hCFave_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQct.exeple2");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exxaem");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.examplcttxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examxem123.exeplabctxéxeealreadI_hlave_ists.example.txzxampleample.exette");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exxaem123.exeple2ee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("there.aremorethan3digits1.tx.to.234567890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlavthe.tabctxéxam.exam12.tx.to.xeplple.exettxexamlplexample._abthave_n_dose..to.rearemorethan3digits123456890inthisnamep.3.exeepleeabcd.xt.txtt.tx.to..exee_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_haveI_n_dots");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa1mplx1.exaem123.exeple23.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("NPsZuOM");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("eaalreadI_hlave_ists.examtherearemorethan3digits1.tx.to.234567890inthisname.exeple.txI_have_mno_de.Qalreab1.exam123.exeple23.exetxttadyexists.txzf1.exam123.exeple23.exemplehigitsalr_do_tsz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exampleigits_or_I_have_no_de.Qalreadyexistsalralreadyexists.txzeadyexiI_have_n_dotssts.example.txzm.txzf1.exam123.exeple23.exempleigitthaabcd.x.txtt.tx.to.I_have_no_digits_or_dotsbcterearemorethan3digits1234567890inthisname.exes_or_do_ts.3.exeeplabcd.ctxxdttdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlavthe.tabctxéxam.exam12.tx.to.xeplple.exettxexamlplexample._abthave_n_dose..to.rearemorethan3digits123456890inthisnamep.3.exeepleeabcd.xt.txtt.tx.to..exee_rists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits1.tx.toabct.2abcd.ctxxtherearemorethan3digits1.tx.to.234567890inthisname.exettexample.txz56123.exe7890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_hQave_no_de.Qalreadyexists.ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctaxatt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQQfI_have_no_de.Qdo_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlavthe.tabctxéxam.exam12.tx.to.xeplple.exemple.ttxexamlplexample._abthave_n_dose..to.rearemorethan3digits123456890inthisnamep.3.exeepleeabcd.xt.txtt.tx.to..exee_rists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlavthe.tabctxéxam.exam12.tx.to.xeplple.exettxexamlplexample._abthave_n_dose..to.rearemorethan3digits12345abctaxatt6890inthisnamep.3.exeepleeabcd.xt.txtt.tx.to..exee_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("there.aremorethan3digitms1.tx.to.234567890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have.tx.to._ists.ep.3.exeepleexample.txzeebab");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.examplmeabctxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("12I_have_no_digits_or_dots3.ex_éxampl1.exaeam123abI_hCFave_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQct.exeple23.exee.exaee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_n_dotsyexists.example.txI_have_no_de.exampleigits_.exam112.tx.to.xeplor_do_tsvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_haabctxI_have_no_de.exampleigzflgists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_haxempleigits_or_dxo_ts.3.exeeplabcd.ctxxttdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_haxempleigits_or_dxo_ts.3.exeeplabcd.ctxxtabttdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exaem123..exepealreadI_hlave_ists.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.eexample.txzttexies1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.ample.txzle2ee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exaQmple.T");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_no_de.Qalrenadyexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tesflgpleam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcd.x.txtt.txe.to.I_have_no_digits_aobr_dots");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_nao_de.Qalream123ts_or_do_tesflgpleam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxampl1.etherearemoreethan3digits123456890inthisname.exexaem123abI_have_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQct.exeple23.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exe.examp.3.exeeplabcd.ctp.lQflp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.g3.exeepleexxttlctxttéxample.exaeaem123.exeple23xe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_dtigits_Qalreadyexists.txzflgor_dotasalreQzflgists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_mno_de.Qalreab1.exam123.exeple23.exetxttadyexists.txzf1.exam123.exeple23.exemplehigitsalr_do_tséxample.pexaae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_haxempleigits_or_dxo_ts.3.exeeplabcd.cexamlplI_have_n_dose.txxttdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemor");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("NVPsZM");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzfe1.I_have_no_de.QalreadyexistsI_have_no_de.QalreadyabctxI_havex_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tesam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctxxttpexam123.exeple23.exempleigits_ores");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_404() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_haabctxI_have_no_de.exampleigzflgiaabcd.x.txtt.tx.to.I_have_no_digits_or_dotsbctsts.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eam");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txztteabctI_have_n_dotsxI_have_noleigits_or_do_txtt.tx.to.123.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadye1.exe.examp.3.exeeplabcd.ctp.lQflp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.g3.exeepleexxttlctxttéxample.exaeaem123.exeple23xe.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctxéxe.exett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_dae.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tes");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxample.e.3.exeeplabcd.ctp.lQflg3.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxampl1.exaem123abI_have_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQcéxample.e.3.exeeplabcd.ctp.lQflg3.exeepleexxttxaet.exeple23.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alralreadyexists.txzeadyexistabctxI_have_no_de.example_tsatts.example.p.3.exeepleez");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_n_dotsyexists.exam1.exexamQI_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tesflgpleam123.exeple23.exeple.txvzb");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_havab1.exam123Qalreadyexists.txzflg.exeple23.exetxette_ists.example.txzee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits1.tx.to.9r0inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("F");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exampleec.exampleabctxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits1.tx.toabct.2abcd.ctxxtherearemorethan3digits1.tx.to.234567890inthisname.exettexample.txz56123.exe7890insthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.examplcttxtet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have.tx.to._ists.ep.3.exeepleeI_have_no_de.exampleigits_or_I_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctxxdttdo_tsxample.txzee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("cd.x.NVPsZMtxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.QalreadyabctxI_have_no_de.examipleigits_or_do_tsattexp.lQflg3.exeepleeis1ts.txzf1.exam123.exeple23.exempleigits_or_dos");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exdam123.exedple23.exempleigits_or_do_teslg3.exeepleeabcd.xt.txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("oI_have_no_digits_o");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlavthe.tabctxéxam.exam12.tx.to.xeplple.exettxexamlplexample._abcttxéxample.exettabthave_n_dose..to.rearemorethan3digits12345abctaxatt6890inthisnamep.3.exeepleeabcd.xt.txtt.tx.to..exee_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_n_dotsyexists.exa1.exe.examplctxttaem123.exeple23xemple.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examéxample.e.3.exeeplabcd.ctp.lQflg3.exexm123.exeple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_n_dotsyI_have_no_de.exaaTmpltherearemorethan3digits1234567890inthisnamae.exeeigits_or_do_tseCFxists.example.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_dtigits_Qalreadyexists.txztxz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemor1.exe.examplctxttaem123.exeple23xeethan3digits1.tx.to.23456123.exe7890inthisnameabcd.ctxxttexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctxéxeexaQmple.Ttt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("eealreadI_hlave_istI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exa123.exeple23.exempleigits_or_do_tess.example.txzxample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_mno_de.Qalreab1.exam123.exeple23.exetxttadyexists.txzf1.exam123.exeple23.exemplehigitsalr_do_tséxatherearemrorethan3digits1.tx.to.234561eabcd.ctxxttexemple.pexaae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_434() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQflgpleealreadI_hlave_ists.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.etherearemorethan3digits1.tx.toabct.23456123.exe7890inthisname.exexampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.ample.txzam123.exple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQQfI.eameple23.exempleigits_or_do_txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("oI__have_no_digits_or_dotrs");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctabcd.x.txtt.txe.to.I_have_no_digits_or_dots");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadyextists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examlplexample._have_n_dose.I_hp.3.exeepleeabcd.xto.salreQflgists.txnz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exéxampl1.etherearemoreethan3digits123456890inthisname.exexaem123abI_have_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQct.exeple23.exee.exaeple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("12I_have_no_digits_or_dots3.ex_éxampl1.exaeam123abI_hCFave_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQct.ep.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txztteabctI_have_n_dotsxI_have_noleigits_or_do_txtt.tx.to.123.exexeple23.exee.exaee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_mno_de.Qalreab1.exam123.exeplem23.exetxttadyexists.txzf1.exam123.exeple23.exemplehigitsalr_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemexample.T.to.23456i7890inthisname.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".31.exexamQI_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeplee23.exempleigits_or_do_tesflgpleam123.exeple23.exe.e123.exexeeplabcd.ctp.eexxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_n_dotsyeCFxists.nexample.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexiNVZuOMM.3.exeeplees1ts.txzf1.exam123.exedple23.exempleigits_or_do_teslg3.exeepleeabcd.xt.txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam12its_or_do_teslg");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealhreadI_hlave_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemoreI_have_n_dotabcQalreadyexists.ttxzflxgtsthan3digits1234567890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxample.e.3.exeeplaexaQmple.Tbcd.ctp.lQflg3.exeepleexxttxae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exe.examplctxttaem3123.exeple23xe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_452() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemor1.exe.examplctxttaem123.exeple23xeethan3digits1.tx.to.23456123.exe7890inthisnameabcd.ctxxttI_have_mno_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigitsalreadI_have_ists.example.txz_or_do_tse");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examlplexample._have_n_I_have_no_digits_or_dotsaltreadyexists.txzdose.I_have_no_digits_Qalreadyexists.txzflgor_dotsalreQflgists.txnz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa1mpl1.exaem123.exoI__have_no_digits_or_dotrseple23.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemor1.exe.examplctxttaem123x.exeple23xeethan3digits1.tx.to.23456123.exe7890inthisnameabcd.ctxxttexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("NPsZ1.exexamQI_have_nao_de.Qalream123.exeplee23.exempleigits_or_do_tesflgpleam123.exeple23.exeuOM");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_457() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exam1ple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.3.exeepleealralreadyexists.txzeadyexiI_have_n_dottssts.example.txzabcde.exampleabctxtt.xt.txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_dtigits_Qalreadyexists.txzflgor_dotsalreQzflgistI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exa123.exeple23.exempleigits_or_do_tess.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeplee23.exempleigits_or_do_tesflgpleam123.exeple23e.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ep.3.exeepleealralreadyexists.txzeadyexiI_have_n_dotssts.example.txzabcde.exampleabctxtt.xt.txtt.tx.to.am");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exampleigits_or_I_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleirtdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_mno_de.Qalreab1.examlplexample._have_n_I_have_no_digits_or_dotsaltreadyexists.txzdose.I_have_no_digits_Qalreadyexists.txzflgor_dotsalreQflgists.txnzséxample.pexaae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxampl1.exaI_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_tseam123abI_hCFave_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQct.exeple23.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exam112.tx.toI_have_no_digits_oepl");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlavthe.tabctxéxam.exam12.tx.to.xeplple.texettxexamlplexample._abcttxéxample.exettabthave_n_dose..to.rearemorethan3digits12345abctaxatt6890inthisnamep.3.exeepleeabcd.xt.txtt.tx.to..exee_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("Otherearemor1.exe.examplctxttaem123.exeple23xeethan3digits1.tx.to.23456123.exe7890inthisnameabcd.ctxxettI_have_mno_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigitsalreadI_have_ists.example.txz_or_do_tseKI");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_mno_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigitsalreadI_have_istss.example.txz_or_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exampleigits_or_I_have_no_de.Qalreadyexistsalralreadyexists.txzeadyexiI_have_n_dotssts.example.txzm.txzf1.exam123.exeple23.exempleigitthaabcd.x.txtt.tx.to.I_have_no_digits_or_dotsbcterearemorethan3digits1234567890inthisalralreadyexists.txzeadyexistabctxI_have_no_de.exampleigits_or_do_tsatts.example.p.3.exeepleezname.exes_or_do_ts.3.exeeplabcd.ctxxdttdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éx");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("tI_hQave_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_tsherearemorethan3digits1.tx.to.23456123.exe7890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examlplexample._have_n_dose.I_have_no_digits_Qalreadyexists.txzflgor_dotsalrexamplee.exampleabctxtteQflgists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxample.e.3.exeeplabcd.ctp.lQflg3.exeepleexxttexaeF");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exaexamplee.exampleabctxttmlplI_have_n_dose.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeplee23.exempleigits_or_d.3.exeeplabcd.ctp.lQflp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeplQe2e3.exempleigits_or_do_txtt.tx.to.g3.exeepleexxtto_tesflgpleam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exam123.exeple23éxampl1.exaeam123abI_hCFave_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.t.exeple23.exee.exaee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeplee23.exempleigits_or_do_tesflgpleam123.exeple.23e.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exampleigits_or_I_have_no_de.Qtalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctabctxéxample.exettxxttdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_479() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examI_hQave_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_tslplI_have_n_dose.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examlplexample._have_n_I_have_no_digits_or_dotsaltreadyexists.txzdose.I_have_no_digitsi_Qalreadyexists.txzflgor_dotsalreQflgists.txnz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aalreadI_have_n_dotsyexists.exa1.exe.examplctxttaem123.exeple23xemple.txvzbcd.ctxxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("gudadVYH");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemor1.exe.examplctxttaem123x.ep.3.exeepleealralreadyexists.txzeadyexiI_have_n_dotssts.example.txzabcd.xt.txtt.tx.to.xeple23xeethan3digits1.tx.to.23456123.exe7890inthisnameabcd.ctxxttexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_t_xtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_nao_de.Qalream1alreadI_have_atatn_dotsyexists.exoample.txvz23ts_or_do_tesflgpleam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abI_haveI_n_dots1.elxam123.exeple23.exetxett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ab1.examplpe23.exeett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlavthe.tabctxéxam.exam12.tx.to.xeplple.exettxexamlplexample._abcttxéxampI_haxempleigits_or_dxo_ts.3.exeeplabcd.ctxxtabttdo_tsle.exettabthave_n_dose..to.rearemorethan3digits12345abctaxatt6890inthisnamep.3.exeepleeabcd.xt.txtt.tx.to..exee_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exp.lQQfI.eameple23.exempleigits_or_do_txtt.tx.to.amplee.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcd.ct567890inthisname.exett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("NOVPsZuOM");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_no_deealreadI_hlave_ists.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.ethefrearemorethan3digits1.tx.toabct.23456123.exe7890inthisname.exexampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.ample.txz.Qalreadyexis1ts.txzf1.exam123.exeplee23.exempleigits_or_do_tesflgpleam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("CCF");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exam123.etherearemoreethan3digits123456890inthisname.exexeple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_hQave_n_de.Qalreadyexistse.ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alralreadyexists.txzeadyexiexample.ss.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemoreI_have_n_dotsthan3digits1234567890inthisname.exealreadI_have_n_dotsyexists.example.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlavthe.tabctxéxam.exam12.tx.to.xeplple.exettxexamlplexample._abthave_n_dose..to.rearemorethan3digits123456890inthisnamep.3.exeepleeabcd.xt.txtt.tx.to..exee_istsabcttxéxample.exett.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("eexaQmple.T");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.3.exeepleealralreadyexists.txzeadyerxiI_have_n_dotssts.example.txzabcd.xt.txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_atatn_dotsyexists.exmple.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abeealreadI_hlave_iststxzxamplectxéxeexaQmple.Ttt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcdI.x.txtt.txe.to.I_have_no_digits_or_dots");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exampleealreadI_hlave_ists.example.examplempmle..txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.QalreadyabctxI_atathave_no_de.examipleigits_or_do_tsattexp.lQflg3.exeepleeis1ts.txzf1.exam123.exeple23.exempleigits_or_dos");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exéxampl1.etherearemoreethan3digits123456890inthisname.exexaem123abI_have_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQct.exeple23.exoee.exaeple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.exampltleabctxtee.examplet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ab1.exam123.exeplep.3.exeepleealralreadyexists.txzeadyexiI_have_n_dotssts.example.txzabcd.xt.txtt.tx.to.23.exeett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits123456890inththere.aremorethan3digitms1.tx.to.234567890inthisname.exeisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".3.exeeplabcd.ctp.lQflg3.exeepleexxttp.3.exeeplee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have.tx.to._ists.ep.3.exeepleexample.txzeebababctxéxepealreadI_hlave_ists.example.txzxampleample.exett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxample.e.3.xexeeplaexaQmple.Tbcd.ctp.lQflg3.exeepleexxttxae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.Qalre1.exam123.exeple23éxampl1.exaeam123abI_hCFave_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.t.exeple23.exee.exaeeadyabctxI_havex_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tes");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.Qalreadyexists.ttherearemorethan3digits1234567890inthisname.exexzf1.exam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctxxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("tI_hQave_no_de.Qalreadyexists.txzf1.e.examplctxttexam123.exeple23.exempleigits_or_do_tsherearemorethan3digits1.tx.to.23456123.exe7890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_516() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_haeve_no_de.exampleigits_or_I_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_517() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_no_de.Qalreadyexis1ts.txzf1.exam1233.exempleigits_or_do_tesflgpleam123.exeple23e.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_518() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".3.exeeplabcd.ctp.lQflg3.exeeplee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_519() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examQflgpltherearemorethan3digits1.tx.to.23456i7890inthisname.exee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_520() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exe.exI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tesamplctxttaem123.exeple23xe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_521() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("eealrxeadI_have_n_dotsyeCFxists.nexample.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_522() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreaadI_have_n_dotsyexists.exoample.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_523() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_haabctxI_have_no_de.exampleigits_or_do_tsattve_no_digits_alreadyexists.txzflgor_dotsalreQzflgists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_524() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ab1.exam123.exeple23.exetxettherearemorethant3digits1.tx.to.234567890inthisname.exet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_525() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_haxempleigits_or_dxo_alreadI_have.tx.to._ists.ep.3.exeepleeI_have_no_de.exampleigits_or_I_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctxxdttdo_tsxample.txzeets.3.exeeplabcd.ctxxttdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_526() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exe.exI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempNVZuOMM.3.exeepleeleigits_or_do_tesamplctxttaem123.exeple23xe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_527() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("thaabcd.x.txtt.tx.to.I_have_no_digits_or_dotsbcterearemorethan.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_528() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_nalreaadI_have_n_dotsyexists.exoample.txvzos");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_529() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadyyexists.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_530() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("there.aremorethan3digitms1.tx.to.234567890ointhisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_531() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("eealreadI_hlave_eistse.exaImpale.txzxample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_532() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("gudadVtherearemexample.T.to.23456i7890inthisname.eH");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_533() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctxéxeexTaQmple.Ttt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_534() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exaem2123.exeple2ee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_535() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alrea_have_n_dotsyeCFxists.example.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_536() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_hQave_no_de.Qalreadyexists.txzf1.exam123.exeple23.ex.empleigits_or_do_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_537() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ba.exampleealreadI_hlave_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_538() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exam123.e2xepl1xe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_539() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("tI_hQave_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_tsherearemorethan3digits1.tx.to.23456123..exe7890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_540() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.3.exeepleealralreadyexists.txzeadyerxiI_have_n_dotssts.example.txxzabcd.xt.txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_541() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamI_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctxxttple.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_542() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exaem2123.exeple1.exexamQI_have_no_de.Qalreadyexis1ts.tpxzf1.exam1233.exempleigits_or_do_tesflgpleam123.exeple23e.exe2ee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_543() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_t_xtt.tx.toalralreadyexists.txzeadyexistabctxI_have_no_de.exampleigits_or_do_tsatts.example.p.3.exeepleez.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_544() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digi9ts1.tx.to.9r0inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_545() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlavthe.tabctxéxam.exam12.tx.to.xeplple.exettxexamlplexample._abthave_n_dose..to.rearemorethan3digits123456890inthisnamtep.3.exeepleeabcd.xt.txtt.tx.to..exee_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_546() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.QalreadyabctxI_have_no_de.example1.exe.examplctxttaem123.exeple23xeigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tes");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_547() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealCCFtxexamlplecttxéxampI_haxempleigits_or_dxo_ts.3.exeeplabcd.ctxxtabttdo_tsle.exettabthave_n_dose..to.rearemorethan3digits12345abctaxatt6890inthisnamep.3.exeepleeabcd.xt.txtt.tx.to..exee_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_548() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_atatn_therearemoreI_have_n_dotsthan3digits1234567890intdhisnamabctxI_have_no_de.exampleigits_or_do_I_have_no_examplee.de.exampltherearemorethaen3digits1234567890inthisnamae.exeeigits_or_tstsattedotsyexists.exmple.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_549() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exmmleealreadI_hlave_ists.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.etherearemorethan3digits1.tx.toabct.23456123.exe7890inthisname.exexampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.atxz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_550() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_haxempleigits_or_dxo_ts.3.exeeplabcdc.ctxxtabttdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_551() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_no_de.Qalrenadyexis1ts.txzf1.exam123.exeple23.exempleigitstherearemorethan3digits1.tx.toabct.2abcd.ctxxtherearemorethan3digits1.tx.to.234567890inthisname.exettexample.txz56123.exe7890inthisname.exe_or_do_tesflgpleam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_552() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.QalreadyabctxI_have_no_de.examipleigits_or_do_tsattexp.lQflg3.exeepleeis1ts.txzf1.exam123.exeple23.exemealreadI_hlavthe.tabctxéxam.exam12.tx.to.xeplple.exettxexamlplexample._abthave_n_dose..to.rearemorethan3digits123456890inthisnamep.3.exeepleeabcd.xt.txtt.tx.to..exee_istsabcttxéxample.exett.example.txzpleigits_or_dos");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_553() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemoexamlplexample._have_n_dose.I_have_no_digits_Qalreadyexists.txzflgor_dotsalreQflgists.txnzrethan3digits1.tx.toabct.2abcd.ctxxtherearemorethan3digits1.tx.to.234567890inthisname.exettexample.txz56123.exe7isname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_554() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctxI_have_no_de.extherearemorethan3digits1.tx.toabct.2abcd.ctxxtherearemorethan3digits1.tx.to.234567890inthisname.exettexample.txz56123.exe7890insthisname.exeampleigits_or_do_tsatt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_555() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ex1ple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_556() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_ahave_no_digits_Qalreadyexixsts.txzflgor_dotsalreQflgists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_557() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlave_ists.exp.lQQfI_have_no_de.xQalreadyabctxI_have_no_de.etherearemorethan3digits1.tx.toabct.23456123.exe7890inthisname.exexampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.ample.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_558() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcd.xI_have_noNVZuOMM.3.exeeplee_digits_or_dotsbct");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_559() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa1mpl1.exaem123.exoI__have.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_560() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQflgpleam123p.exeple23.exeabctxatt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_561() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctxat1.exexamQI_have_no_de.Qalrenadyexis1ts.txzf1.exam123.exeple23.exempleigitstherearemorethan3digits1.tx.toabct.2abcd.ctxxtherearemorethan3digits1.tx.to.234567890inthisname.exettexample.txz56123.exe7890inthisname.exe_or_do_tesflgpleam123.exeple23.exet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_562() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethant3digits1.tx.to.234567890inthiI_have_mno_de.Qalreab1.examlplexample._have_n_I_have_no_digits_or_dotsaltreadyexists.txzdose.I_have_no_digits_Qalreadyexists.txzflgor_dotsalreQflgists.txnzséxample.pexaaesname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_563() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ab.exxaemctxéxe.exett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_564() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_e.examplctxttalreadyexistse.ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_565() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.examplleabctxtebe.examlet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_566() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexiNVZuOMM.3.exeeplees1lts.txzf1.exam123.exedple23.exempleigits_or_do_teslg3.exeepleeabcd.xt.txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_567() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_n_dotsyeCéxampl1.exaem123.exeple23.exee.exaeFxists.nexample.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_568() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.examplleabctxtee.exthere.aremorexamlplexample._have_n_I_have_no_digits_or_dotsaltreadyexists.txzdose.I_have_no_digitsi_Qalreadyexists.txzflgor_dotsalreQflgists.txnzethan3diabctxttname.exeamplet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_569() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.3.exeepleeabcd.xt.txtt.txp.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_570() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_hQave_n_de.yexeistse.tsexett");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_571() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlavthe.tabctxéxam.exam12.tx.to.xeplple.texettxexamlplexample._abcttxéxample.exettts.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_572() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQflgpleealreadI_hlave_iséxamI_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctxxttple.exaets.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.etherearemorethan3digits1.tx.toabct.23456123.exe7890inthisname.exexampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.ample.txzam123.exple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_573() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("NZPsZ1.exexamQI_have_nao_de.Qalream123.exeplee23.exempleigits_or_do_tesflgpleam123.exeple23.exeuOM");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_574() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".3.exctp.lQflg3.exeepleexxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_575() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aldyexists.txzeadyexiI_have_tn_dotssts.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_576() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exe.examp.3.exeeplabcd.ctp.lQflp.lQQfI_eadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.g3.exeepleeeaem123.exeple23xe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_577() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemor1.eéxampl1.exaI_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_tseam123abI_hCFave_éxample.exaen1.exam123.exeple23.exeo_digits_or_dotsalreadyexists.txzQct.exeple23.exee.exaexe.examplctxttaem123.exeple23xeethan3digits1.tx.to.23456123.exe7890inthisnameabcd.ctxxttexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_578() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlavthe.tabctxéxam.exam12.tx.to.xeplple.exettxexamlplexample._abcttxéxampI_haxempleigitxs_or_dxo_ts.3.exeeplabcd.ctxxtabttdo_tsle.exettabthave_n_dose..to.rearemorethan3digits12345abctaxatt6890inthisnamep.3.exeepleeabcd.xt.txtt.tx.to..exee_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_579() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("NPsZ1.exexamQI_have_nao_de.Qalream123.exeplee23.exempleigiQts_or_do_te3.exeuOM");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_580() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_atatn_.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_581() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abat");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_582() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("tI_hQave_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_tsherearemorethan3digits1.xe7890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_583() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa.mpl1.exaem123.exeple23.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_584() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exampleealreadtherearemorethan3digits1234567890inthisname.exeI_hlave_ists.example.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_585() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa1mplx1.exaem123.exeple23.exee.exalQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam12its_or_do_teslge");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_586() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exampleigits_or_I_have_no_deI_have_no_digits_or_dotsalreadyexists.txz.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctabctxéxample.exettxxttdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_587() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("NOVPsI_haabctxI_have_no_de.exampleigits_or_do_tsattve_no_digits_alreadyexists.txzflgor_dotsalreQzflgists.txzZuOM");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_588() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa1.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_589() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ee.exam.example");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_590() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlave_ists.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigitsexamplee._or_do_tsaalreadyexists.I_have_mno_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_tsexample.txzttexis1ts.txzf1.exam123.exeple23.exz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_591() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxample.e.3.xexeeplaeQxaQmple.Tbcd.ctp.lQflg3.exeepleexxttxa");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_592() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxtherearemorethan3digits12345123.exe67890inthiisnample.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_593() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ab1.exam123.exeple23.exetxettherabearemorethant3digits1.tx.to.234567890inthisname.exet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_594() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exe.exI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempNVZuOMM.3.exeepleeleigits_or_do_tI_have_no_de.QalreadyabctxI_atathave_no_de.examipleigits_or_do_tsattexp.lQflg3.exeepleeis1ts.txzf1.exam123.exeple23.exempleigits_or_dosesamplctxttaem123.exeple23xe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_595() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examI_hQave_no_de.Qalreadyexists.txzgits_or_do_tslplI_have_n_dose.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_596() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("léxaxmple.exe");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_597() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ealreadI_hlave_ists.exp.lQQfI_have_no_de.xQalreadyabctxI_have_no_de.etherearemorethan3digits1.tx.toabct.23456123.exe7890inthisname.exexampleigits_or_do_tsaalreadyexists.example.txzttexI_haxempleigits_or_dxo_alreadI_have.tx.to._ists.ep.3.exeepleeI_have_no_de.exampleigits_or_I_have_no_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_ts.3.exeeplabcd.ctxxdttdo_tsxample.txzeets.3.exeeplabcd.ctxxttdo_tsis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.ample.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_598() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exampexampleec.exampleabctxttle.T");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_599() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxtherearemorethan3digits12e345123.exe67890inthiisnample.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_600() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa1mplxe1.exaem123.exeple23.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_601() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadyyexists.aexampp.3.exeepleetxz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_602() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exe.examp.3.exeeplabcd.ctp.lQflp.lQQfI_eadyexists.example.txzttherearemorethan3digits1234567890inthisname.exetexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.g3.exeepleeeaem123.exeple23xe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_603() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txztteabctI_have_n_dotsxI_have_noleigits_or_do_123.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_604() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa1mpl1.exaem123.exoI__have_no_digiseple23.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_605() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits123456890inththere.aremorethan3digitms1.tx.to.r234567890inthisname.exeisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_606() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_no_de.exampleigits_or_I_have_no_de.QalreadyeI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tests.txzf1.exam123.exeple23.exempleirtdo_ts");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_607() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exe.exI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_tesamplctxttaem123.exeple23alreadI_have.tx.to._ists.ep.3.exeepleexample.txzeee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_608() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examlplexample._have_n_I_have_no_digits_or_dotsaltresadyexistseQflgists.txnz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_609() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctxxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_610() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQflegpleam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_611() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("oI_have_I_have_no_de.exampltherearemorethan3digits1234567890inthisnamae.exeeigits_or_do_tsno_digits_o");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_612() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ab1.exampt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_613() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abctxat1.exexamQI_have_no_de.Qalrenadyexis1ts.txzf1.exam123.exepl.e23.exempleigitstherearemorethan3digits1.tx.toabct.2abcd.ctxxtherearemorethan3digits1.tx.to.234567890inthisname.exettexample.txz56123.exe7890inthisname.exe_or_do_tesflgpleam123.exeple23.exet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_614() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("NO_VPsI_haabctxI_have_no_de.exampleigits_or_do_tsattve_no_digits_alreadyexists.txzflgor_dotsalreQzflgists.txzZuOM");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_615() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaI_have_éxample.exaeno_digits_or_dotsalreadyexists.txzQmple.e.3.xexeeplaexaQmple.Tbcd.ctp.lQflg3.exeepleexxttxae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_616() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".alreadI_have_n_dotsyexists.example.txI_have_no_de.exampleigits_or_do_tsvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_617() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exam112e.tx.to.xepl");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_618() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("léxaxmple.e.xe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_619() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("I_have_éxample.exaen1.exam12ealreadI_hlave_ists.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigitsexamplee._or_do_tsaalreadyexists.I_have_mno_de.Qalreadyexists.txzf1.exam123.exeple23.exempleigits_or_do_tsexample.txzttexis1ts.txzf1.exam123.exeple23.exz3.exeple23.exeo_digits_or_dotsalreadyexists.txzQ");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_620() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadyyexisealreadI_hlave_ists.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigitsexamplee._or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exzts.aexampp.3.exeepleetxz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_621() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".3.exeep");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_622() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".3.exeeplabcd.ctp.lQflg3.exeepleexxtalreadI_have_n_dotsyexists.example.txI_have_no_de.exampleigits_.exam112.tx.to.xeplor_do_tsvzt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_623() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("altherearemoreI_have_n_dotabcQalreadyexists.ttxzflxgtsthan3digits1234567890inthisname.exereadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_624() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("p.lQQfI_havI_have_no_de.QalreadyabctxI_have_no_de.examipleigits_or_do_tsattexp.lQflg3.exeepleeis1ts.txzf1.exam123.exeple23.exempleigits_or_dose_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsattexiNVZuOMM.3.exeeplees1lts.txzf1.exam123.exedple23.exempleigits_or_do_teslg3.exeepleeabcd.xt.txtt.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_625() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxampl1.exaem123abI_have_éxample.exaen1.exam1NOVPsZuOM.txzQct.exeple23.exee.exae");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_626() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1.exexamQI_have_no_de.Qalreadyexis1ts.txzf1.exam123.exeplee23.exempleigits_or_d.3.exeeplabcd.ctp.lQflp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.exampleigits_or_do_tsaalreadyexists.example.txztgudadVYHtexis1ts.txzf1.exam123.exeplQe23.exempleigits_or_do_txtt.tx.to.g3.exeepleexxtto_tesflgpleam123.exeple23.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_627() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_n_hdotsyexists.example.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_628() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.examplleabctxtee.eextherearemorethan3digits1.tx.to.23456i7890inthisname.exeamplet");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_629() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemor1.exe.examplctxttaem123x.exeple23xeethan3digits1.tx.to.23456123.exe7890inthisnameabe.examplexxttexe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_630() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("NPsZuéxa1mpl1.exaem123.exoI__ha1.exexamQflgpleealreadI_hlave_ists.exp.lQQfI_have_no_de.QalreadyabctxI_have_no_de.etherearemorethan3digits1.tx.toabct.23456123.exe7890inthisname.exexampleigits_or_do_tsaalreadyexists.example.txzttexis1ts.txzf1.exam123.exeple23.exempleigits_or_do_txtt.tx.to.ample.txzam123.exple23.exeve.exaeM");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_631() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("a23.e2xeples.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_632() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exam12.3.exeple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_633() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("FWYVZodEW");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_634() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemexample.Torethan3digits1.tx.to.e23456i789inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_635() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreadI_have_atatn_therearemoreI_have_n_dotsthan3digits12345r67890intdhisnamabctxI_have_no_de.exampleigits_or_do_I_have_no_examplee.de.exampltherearemorethaen3digits1234567890inthisnamae.exeeigits_or_tstsattedotsyexists.exmple.txvz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_636() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("..txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_637() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exam_ple.com");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_638() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("example.xlsx");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_639() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("invalid_name");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_640() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("example.1234.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_641() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("example.TXt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_643() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exetxt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_644() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcalreadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_645() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_646() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".t.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_647() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxample.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_648() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_649() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".t.123.exeo.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_651() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcalreadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_652() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("labcalreadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_653() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exameple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_654() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcalreaéxamabcd.txttple.edyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_655() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exampo.tx.to.le");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_656() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".t.t.123.exeo..to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_657() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exxaample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_658() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("eemxample.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_659() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx..to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_660() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx...t.t.123.exeo..to.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_661() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exxaamplabcalreadyexisttxzd.txttle");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_662() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaéxaemple.exelreadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_663() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx.to.example");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_664() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttherearemorethan3digits1234567890inthisname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_665() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éaxamabcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_666() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcd.txtt.ttherearemorethan3digits1234567890inthisname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_667() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_668() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttherearemorethan3digits123456789.example0inthisname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_669() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyexisttxzd.txttbced.txtt.ttherearemorethan3digits1234567890inthisname.exe.x.to.exampple.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_670() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx...t.t.123example..exeo..to.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_671() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaésxaemple.exelreadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_672() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exampmle");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_673() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcalreaéxamabcd.txttple.tt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_674() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".éxo.tx...t.t.123example..exeo..to.to.ample.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_675() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abo.tx...t.t.123.exeo..to.to.cd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_676() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éx.tx.to.aaebcalreadyexisttxzd.txttmabcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_677() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx...t.t.123example..exeo..taebcalreadyexisttxzd.txtto.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_678() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabxcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_679() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx.tto.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_680() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebaebcalreaéxamabcd.txttple.ttcaésxaemple.exelreadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_681() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttherearemeorethan3digits1234567890inthisname.exe.hx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_682() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.t.to.example");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_683() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3éxamabcd.txttple.edi");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_684() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("12.exxaamplabcalreadyexisttxzd.txttle3.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_685() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_686() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa.éxample.emabxcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_687() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisname.exe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_688() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("Hle");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_689() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".éxo.tx...tp.t.123example..exeo..to.to.ample.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_690() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreéxample.exe");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_691() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txttple.eabo.tx...t.t.123.exeo..to.to.cd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_692() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits12345i67890inthisnhame.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_693() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txttplme.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_694() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.t.to.examéxample.eple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_695() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaédsxaemple.exelreadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_696() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("CDLe.t.t.123.exeo..to.Q");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_697() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txttple.eabo.tx...t.t.12éxamabcd.txttple.e.e.xeo..to.to.cd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_698() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaléxample.emabxcd.txttplme.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_699() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaléxample.aemabxcd.txttplme.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_700() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreéxample.exee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_701() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemorethan3digits1234567890inthisname.exe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_702() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaméxample.exeple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_703() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaédsxaemple.exelreadytexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_704() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemoHlerethan3digits12o.tx...t.t.123example..exeo..taebcalreadyexisttxzd.txtto.345i67890inthisnhame.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_705() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eo.tx..to.xxa.ttherearemorethan3digits1234567890inthisname.exe.x.to.ample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_706() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("CDLe.t.t.123.exeo..toQ");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_707() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3digits1234567890inthisname.exe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_708() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_709() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.téx.tx.to.aaebcalreadyexisttxzd.txttmabcd.txttple.exttbcd.txtt.ttherearemorethan3digits1234567890inthisname.exe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_710() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("QVam");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_711() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("al.tx.to.reéxample.exee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_712() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eo.tx..tlabcalreadyexisttxzd.txtto.xxa.ttherearemorethan3digits1234567890inthisname.exe.x.to.ample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_713() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eo.tx..tlabcalreadyexisttxzd.txtto.xxa.ttherearemoorethan3digits1234567890inthisnam.ttherearemeorethan3digits1234567890inthisname.exe.hx.to.e.exe.x.to.ample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_714() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txlttplme.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_715() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("eemxaeemple.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_716() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabéx.tx.to.aaebcalreadyexisttxzd.txttmabcd.txttple.ecd.txtttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_717() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txttple.eabo.tx...t.tt.12éxamabcd.txttple.e.e.xeo..to.to.cd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_718() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("Hleo.tx.tto.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_719() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éaxamabc.d.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_720() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890inthisname.e.xe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_721() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txttpleéxamabcd.txttple.e.e.xeo..to.to.cd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_722() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcalreaéxamaabcalreadyexisttxzd.txttexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_723() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaclreadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_724() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".t.t.123.e.xeo..to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_725() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aeaebcaédsxaemple.exelreadyexisttxzd.txttbcalreadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_726() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebaebcalreaéxamabcad.txttple.ttcaésxaemple.exelreadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_727() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_728() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890inthisname.e.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_729() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ampal.tx.to..reéxample.exeele");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_730() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("QV.exxaamplabcalreadyexisttxzd.txttleam");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_731() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("QQVam");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_732() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcalreaéxamabcd.txxttple.tt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_733() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcaléxaemple.exereadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_734() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alr.t.t.123.e.xeo..to.eéxample.exee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_735() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisna1me.exe7.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_736() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa.éxample.emabe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_737() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890intaabcalreadyexisttxzd.txttbcd.txtt.ttherearalreadyexists.txzemorethan3digits1234567890inthisna1me.exe7.x.to.hisname.e.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_738() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa.éxample.bemabxcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_739() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcaléxa123.exeemple.exereadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_740() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890inthisname.e.to.xample.t.to.example");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_741() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx.aebcaédsxaemple.exelreadyexisttxzd.txtt.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_742() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aaebcalreadyexisttxzd.txtto.tx.aebcaédsxaemple.exelreadyexisttxzd.txtt.to.abcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisna1me.exe7.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_743() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ulUJxJw");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_744() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".lexxaample.exampmle");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_745() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyexisttxzd.txttbced.txtt.ttherearemorethan3digits1234567890inthisnax.to.exampple.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_746() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxampl.e.emabxcd.txlttplme.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_748() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txttple.eabo.tx...t.t..123.exeo..to.to.cd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_749() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcalreaéxamabcd.txttplet.edyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_750() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éaéxaéxample.emabxcd.txttple.eabo.tx...t.t.12éxamabcd.txttple.e.e.xeo..to.to.cd.txttxamabcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_751() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaéxaemple.exelreadyexisttxzd..eo.tx..to.xxa.ttherearemts1234567890inthisname.exe.x.to.ampletxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_752() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("lHHl");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_753() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ampal.tx.to..reéxam.ple.exeele");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_754() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyexistttxzd.txttbcd.txtt.ttherearemorethan3éxamabcd.txttple.edi");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_755() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("HlHe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_756() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx...t.t.123example..exeo..to.teo.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_757() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaléxample.aemabxcd.txt.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_758() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisname.exe.x.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_759() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".éxo.tx...tp.t.123example..exeo..to.to.ampl.t.123.exeo3.e.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_760() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txlttplme..exampmlee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_761() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ulUJxJwo.tx..to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_762() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx...t.t.12aebcalreaéxamabcd.txttplet.edyexisttxzd.txtt3example..exeo..to.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_763() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyexisttxzd.txttbcd.txtt3.ttherearemorethHlean3digits1234567890inthisname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_764() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx...t.t.123examptle..exeo..to.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_765() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttherearemorethan3diéxaéxample.emabxcd.txttple.egits1234567890inthisname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_766() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("xéaxamabc.d.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_767() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ampleabcaléxa123.exeemple.exereadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_768() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éaxamabecd.txttpléx.tx.to.aaebcalreadyexisttxzd.txttmabcd.txttple.ee.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_769() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3drigits1234567890inthisname.exe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_770() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaédsxaemple.exelreadytexisttxzd.tabcaléxa123.exeemple.exereadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_771() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".tt.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_772() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ex.eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890inthisnamoe.e.to.xampleameple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_773() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.téx.tx.to.aaebcalreadyexisttxzdhan3digits1234567890inthisname.exe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_774() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx...t.t.12axéaxamabc.d.txttple.eebcalreaéxamabcd.txttplet.edyexisttxzd.txtt3example..exeo..to..to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_775() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éaxamabecd.txttpléx.tx.to.aaebcalreadyexisttxztxttmabcd.txttple.ee.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_776() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("..ttx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_777() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcaléxa123.exeemple.exereadyexisttxbzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_778() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("Hleo.txt.tto.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_779() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx.to.éxaéxampl.e.emabxcd.txlttplme.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_780() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".t.t.123.e.xeo.tx.aebcaédsxaemple.exelreadyexisttxzd.txtt.to.o..to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_781() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreaebcalreaéxamabcd.txttplet.edyexisttxzd.txttadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_782() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabCDLe.t.t.123.exeo..to.Qxcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_783() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx...t.t.123examplex.eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890inthisnamoe.e.to.xampleameplee..exeo..to.teo.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_784() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".t.t.123.e.xeo.tx.aebcaédsxaemple.eHlHexelreadyexisttxzd.txtt.to.o..to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_785() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exampml");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_786() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("MmaD");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_787() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("OkzLhkzAu");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_788() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ex.eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.téxample.exetherearemorethan3digits1234567890inthisnamoe.e.to.xampleameple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_789() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("HlCDLe.t.t.123.exeo..to.eQ");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_790() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txttple.eabo.tx...t.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_791() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éaxamabecd.txttpléx.tx.to.aaebcalreadyexisttxzd.txtetmabcd.txttple.ee.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_792() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabéx.tx.to.aaebcalreadyexistQQVamtxzd.txttmabcd.txttple.ecd.txtttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_793() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemoHlerethan3digits12o.tx...t.t.123example...exxaampleexeo..taebcalreadyexisttxzd.txtto.345i67890inthisnhame.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_794() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa.éxample.bemabxcd.xttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_795() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemorae.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_796() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".tthereaeremorethan3diéxaéxample.emabxcd.txttple.egits1234567890inthisname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_797() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcalreaéxamabcd.txttple.éedyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_798() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".tt.t.eo.tx..tlabcalreadyexisttxzd.txtto.xxa.ttherearemorethan3digits1234567890inthisname.exe.x.to.ampleo.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_799() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eo.tx..tlabcalreadyexisttxzd.txtto.xxa.ttherearemoorethan3digits1234567890inthCDLe.t.t.123.exeo..toQisnam.ttherearemeorethan3digits1234567890inthisname.exe.hx.to.e.exe.x.to.ampleéxaléxample.aemabxcd.txt.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_800() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("é.xa.éxample.emabe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_801() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".éxo.tx...t.t.123exam.t.x.to.ple..exeo..to.to.ample.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_802() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaméxam.t.t.123.exeo..to.ple.exeple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_803() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éaxamabecd.txttpléx.tx.to.aaebcalreadyexisttxzd.txtetmabcd.txttple.ee.ce");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_804() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx.aebcaédsxaemple.exeelreadyexisttxzd.txtt.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_805() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exxaamplabcalreadyexisttxzd.txttlo.tx.aebcaédsxaemple.exelreadyexisttxzd.txtt.to.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_806() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digits12345690inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_807() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyéxample.exeexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_808() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemorethan3digitas1234567890inthisname.exe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_809() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eo.tx..to.xxa.ttherearemorethan3digits12364567890inthisname.exe.x.to.ample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_810() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.tx.ttherearemorethan3digits1234567890inthisname.exe.x.to.lttplme.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_811() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreaebcalreaéxamabcd.txttplet.edyexisdttxzd.txttadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_812() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("CDLe.t.t.123.exeaabcalreadyexisttxzd.txttbced.txtt.ttherearemorethan3digits1234567890inthisnax.to.exampple.o..to.Q");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_813() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalrneadyexisttxzd.txttbcd.txtt3.ttherearemorethHlean3digits1234567890inthisname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_814() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alr.t.t.o.tx.tto..t.x.to.ee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_815() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o..tx...t.t.123example..exeéx.tx.to.aaebcalreadyexisttxzd.txttmabcd.txttple.eo..to.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_816() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisname.edxe.x.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_817() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcd.txtt.ttherearemorettthan3digits1234567890inthisname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_818() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreaebcalreaéxamabcd..eaabcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisname.edxe.x.xampletxttplet.edyexisdttxzd.txttadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_819() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisn.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_820() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaléxample.aemabxcd.txttplmeo.tx.tto.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_821() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890intaabcalreadyexisttxzd.txttbcd.txtt.ttherearalreadyexists.txzemorethan3digits1234567890inthisna1me.exe7.x.to.hisname.e.toxample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_822() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabcd.txttpo.tx.tto.le.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_823() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaédalreéxample.exesxaemple.exelreadytexisttxzd.tabcaléxa123.exeemple.exereadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_824() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("axeéxample.exee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_825() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttherearemeorethan3digits1234567890inthisname.e.xe.hx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_826() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyéxample.exeexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisdname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_827() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("é.xa.éxample.o.t.to.examéxample.epleemabe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_828() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éx.tx.to.aaebcalreaebcaédsxaemple.exelreadytexisttxzd.tabcaléxa123.exeemple.exereadyexisttxzd.txtttmabcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_829() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabxcd.txtHletple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_830() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.t.to.eple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_831() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyexistttxzd.txttbcd.txtt.ttherearemorethan3éxamabcd.txttpl.e.edi");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_832() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("Hleo.txt.o.eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemxorethan3digits1234567890inthisname.e.to.xample.t.to.exampletto.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_833() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyexisttxzd.txttbcd.txtt.ttherearemHlHeorethan3digits1234567890inthisn.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_834() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ex.eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcdgits1234567890inthisnamoe.e.to.xampleameple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_835() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxao.tx.to.éxaéxampl.e.emabxcd.txlttplme.ele.ee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_836() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreaebcalreaéxamabcd..tbcd.txtt.ttherearemorethan3digits1234567890inthisname.edxe.x.xampletxttplet.edyexisdttxzd.txttadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_837() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabéx.tx.to.aaebcalreadyexisttxzd.txttmabcdc.txttple.ecd.txtttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_838() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eo.tx..tlabcalreadyexisttxzd.txtto.xxa.ttherearemoorethan3digits1234567890inthCDLe.t.t.123.exeo..toQisnam.ttherearemeorethan3digits1234567890inthisname.exe.hx.to.e.exe.x.to.ampleéxaléxample.aemabxcd5.txt.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_839() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx..o.tx.aebcaédsxaemple.exeelreadyexisttxzd.txtt.to.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_840() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreéxample.exée");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_841() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabCDLe.t.t.123.exeo..to.Qxcd.tttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_842() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ampleabcaléxa123.exeemple.exeready.eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemorethan3digitas1234567890inthisname.exe.x.to.xampleexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_843() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eo.tx..to.xxa.ttherearemoretho.tx...t.t.123examplex.eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890inthisnamoe.e.to.xampleameplee..exeo..to.teo.an3dio.eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890inthisname.e.to.xample.t.to.examplegits12364567890inthisname.exe.x.to.ample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_844() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabCDLe.t.t.123.exeo..to.Qxcd.taabcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisn.ttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_845() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxztd.toxttbcd.txtt.ttherearemorethan3digitcs1234567890inthisname.e.xe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_846() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exampleeaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3drigits1234567890inthisname.exe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_847() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("..ttx.to.o.eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890inthisname.e.to.xample.t.to.example");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_848() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx.aebcaédsxaempale.exeelreadyexisttxzd.txtté.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_849() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaéxaemple.eexelreadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_850() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("Yo.t.to.exampleUG");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_851() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabéx.tx.to.a.exampleaebcalreadyexisttxzd.txttmabcd.txttple.ecd.txtttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_852() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txttple.eabo.tx...t.txtéxamabcd.txttple.et");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_853() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxao.tx.to.éxaéxamalreéxample.exeepl.e.emabxcd.txlttplme.ele.ee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_854() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemoretaebcalreaéxamabcd.txttplet.edyexisttxzd.txtthan3digits1234567890inthisname.e.to.xample.d.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_855() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreaebcttherearemorethan3digits1234567890inthisname.edxe.x.xampletxttplet.edyexisdttxzd.txttadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_856() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx...t.t.123.exe.t.x.to...to.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_857() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttherearemeorethan3digits1234567890inthisame.e.xe.hx.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_858() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyexisttHleo.tx.tto.xzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisn.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_859() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".éxo.tx...t.t.123examp12.exxaamplabcalreadyexisttxzd.txttle3.exele..exeo..to.to.ample.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_860() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa.éxample.bemaabxcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_861() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éaxamabo.tx..o.tx.aebcaédsxaemple.exeelreadyexisttxzd.txtt.to.to.ecd.txttpléx.tx.to.aaebcalreadyexisttxzd.txtetmabcd.txttple.ee.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_862() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("émxaéxample.emabxcd.txlttplme..exampmlee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_863() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx.to.examp");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_865() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3drigits1234567890inthisname.exe.xo.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_866() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3digits123abcd.txtt.ttherearemorethan3digits1234567890inthisname.exe.x.to.67890inthisname.exe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_867() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txlttplmme..exampm.exampmllee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_868() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exaample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_869() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("oYo.t.to.exampleU");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_870() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx...txisttxzd.txtt.to.to...to.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_871() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcd.txtt.ttherearemorettthan3digits1234567890inthisname.exe..exampmleo.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_872() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alex.eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcdgits1234567890inthisnamoe.e.to.xampleameplereéxample.exee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_873() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("é.exxaamplabcalreadyexisttxzd.txttlo.tx.aebcaédsxaemple.exelreadyexisttxzd.txtt.to.ex.tx.to.aaebcalreaebcaédsxaemple.exelreadytexitsttxzd.teabcaléxa123.exeemple.exereadyexisttxzd.txtttmabcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_874() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx...t.t.12axéaxamabc.d.txttple.eebcalreaéxamabcd.txttplet.edyexisttxzd.txtt3éexample..exeo..to..to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_875() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaédsxaemplei.exelreadytexisttxzd.tabcaléxa123.exeemple.exereadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_876() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabéx.tx.to.aaebcalreadyexisttxzd.txttmabcd.dtxttple.ecd.txtttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_877() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("djCJo.eo.tx..tlabcalreadyexisttxzd.txtto.xxa.ttherearemoorethan3digits1234567890inthisnam.ttherearemeorethan3digits1234567890inthisname.exe.hx.to.e.exe.x.to.amplesWi");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_878() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("CDLe.t.t.123.exeaabcalreadyexisttxzd.txttbced.txtt.ttherearemorethan3digitsn1234567890inthisnax.to.exampple.o..to.Q");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_879() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttherearemorethan3digits1234567890inthisnam.eo.tx..to.xxa.ttherearemorethan3digits12364567890inthisname.exe.x.to.amplee.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_880() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcalreaéxamao.tx.to.éxaéxampl.e.emabxcd.txlttplme.ebcd.txttple.edyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_881() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("abcd.txtt.t.eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3drigits1234567890inthisname.exe.xo.xampletherearemorethan3digits1234567890inthisname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_882() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o..tx...t.t.123example..exeéx.tx.to.aaebcalreadyexisttxzd.txttdmabcd.txttple.eo..to.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_883() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aelreéxample.exee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_884() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemoHlerethan3digits12to.tx...t.t.123example...exxaampleexeo..taebcalreadyexisttxzd.txtto.345i67890inthisnhame.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_885() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx..eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3drigits1234567890inthisname.exe.xo.xampleaebcaédsxaemple.exeelreadyexisttxzd.txtt.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_886() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx.aebcaédsxaemple.exeelreadiyexisttxzd.txtt.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_887() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("examplabo.tx...t.t.123.exeo..to.to.cd.t");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_888() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcalreaéxamabcd.txttpo..tx...t.t.123example..exeéx.tx.to.aaebcalreadyexisttxzd.txttdmabcd.txttple.eo..to.to.le.tt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_889() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxampl.e.ebaebcalreaéxamabcd.txttple.ttmacdplme.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_890() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearaebcalreaéxamabcd.txttpo..tx...t.t.123example..exeéx.tx.to.aaebcalreadyexisttxzd.txttdmabcd.txttple.eo..to.to.le.ttemorethan3digits12345690inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_891() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("CDLe.to.tx..eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3drigits1234567890inthisname.exe.xo.xampleaebcaédsxaemple.exeelreadyexisttxzd.txtt.to..t.123.exeaabcalreadyexisttxzd.txttbced.txtt.ttherearemorethan3digitsn1234567890inthisnax.to.exampple.o..to.Q");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_892() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttt.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_893() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreaebcttherearemorethan3digits1234567890inthisname.edxe.x.xampletxttplet.edyexisdttxzd.téxamabxcd.txttple.eidyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_894() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exampleeaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3drigits12345678o.tx...t.t.123example..exeo..taebcalreadyexisttxzd.txtto.90inthisname.exe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_895() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exampo.tx.aaebcalreadyexisttxzd.txtto.tx.aebcaédsxaemple.exelreadyexisttxzd.txtt.to.abcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisna1me.exe7.x.to.to.le");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_896() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eo.tx..to.xxa.ttherearem3orethan3digits1234567890inthisname.exe.x.to.ample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_897() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aeaebcaédsxaemple.exelreadyexisttxzd.txttherearemorethan3digits12345eemxample.i67890inthisnhame.exetbcalreadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_898() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttt.talr.t.t.o.tx.tto.o.eeo.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_899() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaméxample.exeple.le");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_900() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttt.talr.t.t.o.tx.tto.o.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_901() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebaebcalre.eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3drigits1234567890inthisname.exe.x.to.xampleaéxamabcd.txtple.ttcaésxaemple.exelreadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_902() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("exaebcaédsxaemple.exelreadyexisttxzd.txttaample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_903() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eo.aebcaédsxaemple.exelreadytexisttxzd.txtttx..to.xxa.ttherearemorethan3digits1234567890inthisname.exe.x.to.ample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_904() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("CDLe.to.tx..eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3drigits1234567890inthisname.exe.xo.xampleaebcaédsxaemple.exeelreadyexisttxzd.txtt.to..t.123.exeaabcalreadyexisttxzd.txttbced.txtt.tthereareméxaéxample.emabxcd.txlttplme.eorethan3digitsn1234567890inthisnax.to.exampple.o..to.Q");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_905() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemoHlerethan3digits12to.tx...t.t.123example...exxaampleexeo..taebcal.eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemorethan3digitas1234567890inthisname.exe.x.to.xamplereadyexisttxzd.txtto.345i67890inthisnhame.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_906() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ulUJxJwo.tx..toYo.t.to.exampleUG.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_907() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aelereéexample.exee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_908() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("RKYe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_909() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890intaabcalreadyexisttxzd.éxa.éxample.emabetxttbcd.txtt.ttherearalreadyexists.txzemorethan3digits1234567890inthisna1me.exe7.x.to.hisname.e.toxample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_910() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("Céxaméxample.exeple.leDLe.t.t.123.exeaabcalreadyexisttxzd.txttbcedéxaléxample.aemabxcd.txt.ettherearemorethan3digitsn1234567890inthisnax.to.exampple.o..to.Q");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_911() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890intaabcalreadyexisttxzd.éxa.éxample.emabetxttbcd.txtt.CDLe.to.tx..eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3drigits1234567890inthisname.exe.xo.xampleaebcaédsxaemple.exeelreadyexisttxzd.txtt.to..t.123.exeaabcalreadyexisttxzd.txttbced.txtt.tthereareméxaéxample.emabxcd.txlttplme.eorethan3digitsn1234567890inthisnax.to.exampple.o..to.Qttherearalreadyexists.txzemorethan3digits1234567890inthisna1me.exe7.x.to.hisname.e.toxample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_912() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaéxaempredadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_913() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyexistttxzd.txttbcd.txtt.ttherearemorethaxn3éxamabcd.txttpl.e.edi");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_914() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemore.than3digits1234567890inthisname.e.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_915() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemorethan3digitas1234567890inthisname.exe.x.to.xampleo.tx.tto.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_916() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exampleeaabcalreadyexistthan3drigits12345678o.tx...t.t.123example..exeo..taebcalreadyexisttxzd.txtto.90inthisname.exe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_917() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txlttplme..examptmlee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_918() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".exaebcalreaéxamabcd.txttple.éedyexisttxzd.txttampml");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_919() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabCDLe.t.t.123.exeo..to.Qxcpd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_920() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("Céxaméxample.exeple.leDLe.t.t.123.exeaabcalreadyexisttxzd.txttbcedéxaléxample.aemabxcd.txt.etthereaeremorethan3digitsn1234567890inthisnax.to.exampple.o..to.Q");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_921() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("e.t.t.123.exeo..to.Q");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_922() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("eemxaeemmple.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_923() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexi.éxo.tx...tp.t.123exaxmple..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemore.than3digits1234567890inthisname.e.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_924() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreaebcalreaéxamabcd..tbcd.txtt.ttherearemorethan3digits1234e567890inthisname.edxe.x.xampletxttplet.edyexisdttxzd.txttadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_925() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaempCéxaméxample.exeple.leDLe.t.t.123.exeaabcalreadyexisttxzd.txttbcedéxaléxample.aemabxcd.txt.ettherearemorethan3digitsn1234567890inthisnax.to.exampple.o..to.Qlee.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_926() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxao.tx.to.éxaéxampl.e.emabxcd.txlttplme.eele.eee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_927() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcalreaéxamab.t.t.123.exeo..to.cd.txttple.éedyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_928() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aelreéxaméaxamabecd.txttpléx.tx.to.aaebcalreadyexisttxzd.txttmabcd.txttpeemxaeemmple.le.ee.eple.exee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_929() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabCDLe.t.t.123.exeo..to.abcd.txtt.t.eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3drigits1234567890inthisname.exe.xo.xampletherearemorethan3digits1234567890inthisname.exe.x.to.Qxcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_930() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreaebcttherearemorethan3digits12345678xampletxttplet.edyexisdttxzd.txttadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_931() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("QfZGFbPFj");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_932() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx...txisttxzd.txtt.to.eto...to.to..txttple.e.e.xeo..to.to.cd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_933() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa.éxaaebcalreaéxamabcd.txttple.ttmple.emabxcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_934() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttherearemorethan3diéxaéxample.emabxcd.txttple.egits1234567890inthisnabcaléxa123.exeemple.exereadyexisttxzd.txtt.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_935() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemoretaebcalreaéxamabcd.txttplet.edyexisttxzd.txtthan3digits1234567890inthisname.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_936() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("labcalreadyexisttxzéxamabCDLe.t.t.123.exeo..to.Qxcd.txttple.ed.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_937() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ex.eaabcalreadyexi.éxo.tx...tp.3t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890inthisnamoe.e.to.xampleameple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_938() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éaxamabecd.txttpléx.tx.to.aeaebcalreadyexisttxzd.txttmabcd.txttple.ee.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_939() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("bKdJbDq");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_940() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("lHaabcalreadyexisttxzd.txttbced.txtt.ttherearemorethan3digits1234567890inthisnax.to.exampple.l");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_941() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eo.tx..to.xxa.tthereCDLe.t.t.123.exeo..toQarem3orethan3digits1234567890inthisname.exe.x.to.ample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_942() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxao.taebaebcalreaéxamabcad.txttple.ttcaésxaempleéxaéxample.emabxcd.txttple.eabo.tx...t.txtt.exelreadyexisttxzd.txttx.to.éxaéxampl.e.emabxcd.txlttplme.eele.eee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_943() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaéxaemple.eexelreadyexistéxaéxample.emabxcd.tx.ttherearemorethan3digits1234567890inthisname.exe.x.to.lttplme.etxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_944() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaéxaebmple.exelreadyexisttxzd..eo.tx..to.xxa.ttherearemts1234567890inthisname.exe.x.to.ampletxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_945() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("fAefFQan.ttherearemorethan3digits1234567890inthisname.exe.x.to.ZV");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_946() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eo.tx..to.xxa.tthereCDLe.t.t.123.exeo..toQarem3orethan3digits1234567890inthisname.exe.x.to.ampléx.tx.to.aaebcalreadyexisttxzd.txttmabcd.txttple.ee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_947() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eo.tx..to.xxa.ttherearem3orethan3digits1234567890inthisname.exe.x.taabcalrneadyexisttxzd.txttbcd.txtt3.ttherearemorethHlean3digits1234567890inthisname.exe.x.to.o.ample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_948() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabCDLe.t.t.123.exeo..to.Qxcd.txttpleaebcalreaéxamaabcalreadyexisttxzd.txttexisttxzd.txtt.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_949() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.ttx.tto.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_950() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éx.tx.to.aaebcalreaebcaédsxaemple.exelreadytexisttxzd.tabcaléxa123.exeemp.le.exereadyexisttxzd.txtttmabcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_951() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eo.tx..to.xxa.ttherearemoretha3digits12364567890inthisname.exe.x.tao.ample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_952() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ulUJxJwo.taebaebcalreaéxamabcad.txttple.ttcaésxaemple.exelreadyexisttxzd.txttx..toYo.t.to.exampleUG.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_953() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txttRKYe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_954() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ulUJxJwo.tx..toYo.t.to.empl.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_955() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("CDLe.to.tx..eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3dr4567890inthisn9ame.exe.xo.xampleaebcaédsxaemple.exeelreadyexisttxzd.txtt.to..t.123.exeaabcalreadyexisttxzd.txttbced.txtt.tthereareméxaéxample.emabxcd.txlttplme.eorethan3digitsn1234567890inthisnax.to.exampple.o..to.Q");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_956() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttherearemorethan3diéxaéxample.emabxcd.txttple.egits1230inthisname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_957() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreéxamo.tx...t.t.123example..exeo..taebcalreadyexisttxzd.txtto.ple.exée");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_958() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éaxamabc.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_959() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx.to.ex.eo.tx..tlabcalreadyexisttxzd.txtto.xxa.ttherearemoorethan3digits1234567890inthCDLe.t.t.123.exeo..toQisnam.ttherearemeorethan3digits1234567890inthisname.exe.hx.to.e.exe.x.to.ampleéxaléxample.aemabxcd.txt.eample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_960() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("CDLe.t.t.123.exeo..éxa.éxample.emabxcd.txttple.etoQ");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_961() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx..eaabcalreadyexo.tx...txisttxzd.txtt.to.eto...to.to..txttple.e.e.xeo..to.to.cd.txttisttxzd.toxttbcd.txtt.ttherearemoraethan3drigits1234567890inthisname.exe.xo.xampleaebcaédsxaemple.exeelreadyexisttxzd.txtt.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_962() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaléxample.emabxcd.etxttplme.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_963() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.tx...t.t.123examptle..exeo..to.oto.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_964() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxampl.e.emabxcd.txlttplmaeaebcaédsxaemple.exelreadyexisttxzd.txttherearemorethan3digits12345eemxample.i67890inthisnhame.exetbcalreadyexisttxzd.txtte");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_965() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemoretaebcalpreaéxamabcd.txttplet.edyexisttxzd.txtthan3digits1234567890inthisname.e.to.xample.d.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_966() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txttRKYo.tx...t.t.123.exe.t.x.to...to.to.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_967() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éx.tx.to.aaebcalreadyexisttxzd.txttmtabcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_968() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyexistttxzd.txttbcd.txtt.ttéxa.éxample.bemabxcd.txttple.eherearemorethan3éxamabcd.txttpl.e.edi");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_969() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabéxaéxampl.e.emabxcd.txlttplmaeaebcaédsxaemple.exelreadyexisttxzd.txttherearemorethan3digits12345eemxample.i67890inthisnhame.exetbcalreadyexisttxzd.txtteéx.tx.to.aaebcalreadyexisttxzd.txttmabcdc.txttple.ecd.txtttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_970() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890intéxamabCDLe.t.t.123.exeo..to.Qxcpd.txttple.ehisname.e.to.xample.t.to.example");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_971() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaéxaebmple.exelreadyexisttxzd..e.t.t.123.exeo..to.Qrearemts1234567890inthisname.exe.x.to.ampletxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_972() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.aabcalreadyexisttxzd.txttbced.txtt.ttherearemorethan3digits1234567890inthisnax.to.exampple..tx...t..t.123example..exeéx.tx.to.aaebcalreadyexisttxzd.txttmabcd.txttple.eo..to.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_973() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éx.eo.aebcaédsxaemple.exelreadytexisttxzd.txtttx..to.xxa.ttherearemorethan3digits1234567890inthisname.exe.x.to.amplealéxample.emabxcd.etxttplme.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_974() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreéxamo.tx...t.t.123example..exeo..taebcalraebcalreaéxamabcd.txttple.éedyexisttxzd.txtteadyexisttxzd.txtto.ple.exée");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_975() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".éxo.tx...t.t.123examp1a2.exxaamplabcalreadyexisttxzd.txttle3.exele..exeo..to.to.ample.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_976() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxtherearemorethan3digits1234567890inthisname.exeample.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_977() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890intaabcalreadyexisttxzd.éxa.éxample.emabetxttbcd.txtt.CDLe.to.tx..eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3drigits1234567890inthisname.exe.xo.xampleaebcaédsxaemple.exeelreadyexisttxzd.txtt.to..t.123.exeaabcalreadyexisttxzd.txttbced.txtt.tthereareméxaéxample.emabxcd.txlttplme.eorethan3digitsn1234567890inthisnax.to.exampple.o..to.Qttherearalreadyexina1me.exe7.x.to.hisname.e.toxample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_978() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabéx.tx.to.aaebcalreadyexisttxzd.txttmabcd.dtxttple.ecd.txtéttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_979() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ex.eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd.txtt.ttherearemor12.exxaamplabcalreadyexisttxzd.txttle3.exeethan3digits1234567890inthisnamoe.e.to.xampleameple");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_980() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ulUJxJwo.tux..to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_981() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("émxaéxample.emabxcd..txlttplmxe..exampmlee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_982() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttherearemorethan3diéxaéxample.emabxcd.txttple.egits1234567aebcaéxaemple.exelreadyexisttxzd.txtt890inthisname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_983() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttherearemorethan3diéxaéxample.emabxcd.txttple.egits1234567890inthi.eo.tx..tlabcalreadyexisttxzd.txtto.xxa.ttherearemorethan3digits1234567890inthisname.exe.x.to.amplexzd.txtt.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_984() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabc.alreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3digits1234567890inthisname.exe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_985() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o..tx...t.t.123example..exeéx.tx.to.aaxebcalreadyexisttxzd.txttmabcd.txttple.eo..to.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_986() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("émxaéxample.emabxcd..txlttplmxe..exampxmlee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_987() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o..tx.o..t.t.123example..exeéx.tx.to.aaebcalroeadyexisttxzd.txttdmabcd.txttple.eo..to.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_988() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexi.éxo.tx...tp.t.123example..exeo..to.to.ample.esttxztd.toxttbcd...ttx.to.txtt.ttherearemorethan3digits1234567890inthisname.e.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_989() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaéxaemple.exelreadyexisttxzd..eo.tx..to.xxa.ttherearemts1234567890inthisnam.ttherearemorethan3diéxaéxample.emabxcd.txttple.egits1234567890inthi.eo.tx..tlabcalreadyexisttxzd.txtto.xxa.ttherearemorethan3digits1234567890inthisname.exe.x.to.amplexzd.txtt.to.e.exe.x.to.ampletxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_990() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o..tx.o..t.t.123example..exeéx.tx.to.aaebcalroeadyeéxaléxample.aemabxcd.txttplme.exidsttxzd.txttdmabcd.txttple.eo..to.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_991() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreaebcalreaéxamabcd..tbcd.txtt.ttherearemorethan3digits1234567890inthisname.edxe.x.xampletxtherearemorethan3digits1234567890inthisname.exettplet.edyexisdttxzd.txttadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_992() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éaxama..ttx.to.becd.txttpléx.tx.to.aaebcalreadyexisttxzd.txtetmabcd.txttple.ee.ce");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_993() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aeaebcaédsxaemple.exelreadyexisttxzd.txttherearemorethan3digits12345eemxample.i67890inthisnhame.exeadyexisttxzd.txtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_994() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3digit.exe");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_995() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("ulUJxJwo.taebaebcalreaéxamabcad.txttple.ttcaésxaemple.abcaléxaemple.exereadyexisttxzd.txttexelreadyexisttxzd.txttx..toYo.t.to.exampleUG.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_996() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("CDLe.Lt.t.123.exeo..to.Q");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_997() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aeaebcaédsxaemple.exelreadyexisttxzd.txttherearemorethan3digits12345eemxample.i67890intt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_998() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("therearemorethan3dampal.tx.to..reéxample.exeeleigits1234567890inthisname.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_999() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éaxamabecd.txttpléx.tx.to.aaebcalreadyexisttxztxttmabcd.txttple.exe.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1000() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreaebcttherearemorethan3digits1234567890inthisname.edxe.x.xampletxttplet.edyexisdttxzd.eaabcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisname.edxe.x.xample.txttadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1001() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxa.éxample.emabxcd.txttpl.e.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1002() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcalreadyexisttxzd.txttbcd.txtt.ttherearemHlHeoaebcaéxaempredadyexisttxzd.txttrethan3digits1234567890inthisn.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1003() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("fAefFQan.ttoherearemorethan3digi.ZV");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1004() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.txttbcd.txtt.tth12.exxaamplabcalreadyexisttxzd.txttle3.exeerearemorethan3digits123abcd.txtt.ttherearemorethan3digits1234567890inthisname.exe.x.to.67890inthisname.exe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1005() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxample.emabxcd.txlttplemme..exampm.exampmllee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1006() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".ttt.to");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1007() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("o.ttxt.tto.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1008() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaéxaemple.exelreadyexisttxzd..eo.tx..to.xxa.ttherearemts1234567890inthisnam.ttherearemorethan3diéxaéxample.emabxcd.txttple.egits12345HlHe67890inthi.eo.tx..tlabcalreadyexisttxzd.txtto.xxa.ttherearemorethan3digits1234567890inthisname.exe.x.to.amplexzd.txtt.to.e.exe.x.to.ampletxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1009() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".éxo.tx...tp.t.1223example..exeo..to.to.ample.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1010() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabulUJxJwo.taebaebcalreaéxamabcad.txttple.ttcaésxaemple.abcaléxaemple.exereadyexisttxzd.txttexelreadyexisttxzd.txttx..toYo.t.to.exampleUG.calreadyexisttHleoerearemorethan3digits1234567890inthisn.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1011() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexistttxztd.toxttbcd.txtt.ttherearemorethan3digits1234567890inthisname.e.xe.x.to.xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1012() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxamabxcd.txtHleetple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1013() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éaxamabecd.txttpléx.tx.to.aaebcalreadyexis.eo.txéxamabCDLe.t.t.123.exeo..to.Qxcd.taabcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisn.ttple.e..to.xxa.tthereCDLe.t.t.123.exeo..toQarem3orethan3digits1234567890inthisname.exe.x.to.ampléx.tx.to.aaebcalreadyexisttxzd.txttmabcd.txttple.eettxzd.txtetmabcd.txttple.ee.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1014() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("C");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1015() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aebcaéxaemple.exelreadyexisttxzd..eo.tx..to.xxa.ttherearemts1234567890inthisname.exex.x.to.ampletxtt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1016() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("Céxaméxample.exeple.leDLe.t.t.123.exeaabcalreadyexisttxzd.txttbcedéxaléxample.aemabxcd.txt.ettherearemorethan3digitsn1234567890inthisnax.to.eéaxamabc.txttple.exampple.o..to.Q");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1017() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("LyPW");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1018() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreaebcalreaéxamabcd..tbcd.txtt.ttherearemorethan3digits1234e567890inthisname.edxe.x.xampletxttplet.edyexisdttxmzd.txttadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1019() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éx.tx.to.aaebcalreaebcaédsxaemple.exelreadytexisttxzd.tabcaléxa123.exee.mple.exereadyexisttxzd.txtttmabcd.txttple.e");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1020() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreéxamo.tx...t.t.123example..e.xeo..taebcalereadyexisttxzd.txtto.ple.exée");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1021() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaempCéxaméxample.exeple.leDLe.t.t.123.exeaabcalreadyexisttxzd.txttbcedéxaléxaléxample.emabxcd.txttplme.eéxample.aemabxcd.txt.ettherearemorethan3digitsn1234567890inthisnax.to.exampple.o..to.Qlee.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1022() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("aabcabcd.txttalrneadyexisttxzd.txttbcd.txtt3.ttherearemorethHlean3digits1234567890inthisname.exe.x.to.");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1023() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(".eaabcalreadyexisttxzd.toxttbcd.txtt.ttherearemoraethan3digits1234567890xample");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1024() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("éxaéxlample.emabxcd.txlttplemme..exampm.exampmllee");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1025() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("alreaebcalrxamabcd..eaabcalreadyexisttxzd.txttbcd.txtt.ttherearemorethan3digits1234567890inthisname.edxe.x.xampletxttplet.edyexisdttxzd.txttadyexists.txz");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }
}
