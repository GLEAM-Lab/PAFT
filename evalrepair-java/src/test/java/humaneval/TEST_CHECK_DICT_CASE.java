package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.HashMap;
public class TEST_CHECK_DICT_CASE {
    @org.junit.Test(timeout = 1000)
    public void test_0() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("p", "pineapple");put("b", "banana");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_1() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("p", "pineapple");put("A", "banana");put("B", "banana");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_3() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Name", "John");put("Age", "36");put("City", "Houston");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_4() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("STATE", "NC");put("ZIP", "12345");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_5() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("fruit", "Orange");put("taste", "Sweet");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_6() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_7() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "DOE");put("AGE", 35);put("CITY", "NEW YORK");put("INCOME", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_8() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 35);put("city", "New York");put("income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_9() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("cItY", "new york");put("Income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_10() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_12() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("orange", "fruit");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_14() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("yellow", "color");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_16() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 3.14159);
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_17() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("Income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_18() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "New York");put("FIRST_NAME", "cherry");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_19() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_21() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("1", "apple");put("2", "banana");put("3", "cherry");put("Income", "chINCEOMEerry");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_22() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "DOE");put("AGE", 35);put("CITY", "NK");put("INCOME", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_23() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_24() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new york");put("Income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_25() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Incyellowome", "INCOMEJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_26() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "DOE");put("AGE", 35);put("CITY", "NEW YORK");put("INCOME", "$50,000");put("COME", "$50,0000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_27() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_28() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("1", "apple");put("2", "banana");put("3", "cherry");put("Income", "New York");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_29() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("yellow", "color");put("yell", "clor");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_30() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("cItY", "new yorok");put("Income", "$50,000");put("cItIY", 36);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_31() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_32() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "DOE");put("AGE", 35);put("INCOME", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_33() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("2", "banana");put("3", "cherry");put("Income", "New York");put("$50,000", "chrerry");put("Inconme", "bana");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_34() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 35);put("city", "New York");put("income", "$50,000");put("ageage", "Dooe");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_36() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_37() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");put("LASTNAE", "new yorAgeIncIomek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_38() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("2", "banana");put("3", "cherry");put("Income", "New York");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_39() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("Age", 35);put("city", "new yorAgek");put("Income", "$50,000");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_40() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgek");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_41() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 35);put("city", "New York");put("income", "$50,000");put("ageage", "Dooe");put("new yorok", "8");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_42() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DDOE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("LASTENAME", "Anew yorAgek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_43() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 35);put("city", "New YorNk");put("income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_44() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_45() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "New Yoincomerk");put("Income", "$50,000");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_46() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "OE");put("AGE", 35);put("CITY", "NEW YORK");put("COME", "$50,0000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_47() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("Age", 35);put("Income", "$50,000");put("Incomeyeyar", "JoDooehn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_48() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("Income", "$50,000");put("8", "$0,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_49() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Johageage");put("Age", 35);put("cItY", "new york");put("Income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_50() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 3.14159);put("IPI", 2.6443947966293897);put("Johageage", 2.9360614575298136);put("JohaJgeage", 3.14159);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_51() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_52() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("orange", "fruuit");put("or$50,00ange", "fruui");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_53() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "oJohn");put("Last_Name", "Doe");put("city", "New York");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_54() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_55() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("Income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_56() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("Age", "bana");put("cItY", "new yorAgek");put("Income", "$50,000");put("LASTNAE", "new yorAgeIncIomek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_57() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_58() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_59() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("chge", "New YorkLAST_NAME");put("New York", "new york");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_60() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DDOE");put("Age", "D");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_61() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOlast_nameE");put("Age", 35);put("cItY", "new yorok");put("Income", "$50,000");put("cItIY", 36);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_62() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "New York");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_63() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("2019", "firstName");put("YorNk", "firstNam$50,0000e");put("NEW YORK", "fDOlast_nameEirstName");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_64() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("orange", "JoDooehn");put("Dooe", "JoDooehhn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_65() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "OE");put("AGE", 35);put("CITY", "NEW YORK");put("COME", "$50,0000");put("YORK", "$50,00000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_66() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgekcolor");put("Income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_67() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 35);put("city", "oNew YorNk");put("income", "$50,000");put("Newage", "2,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_68() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 35);put("income", "$50,000");put("ageage", "Dooe");put("new yorok", "8");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_69() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("Income", "YORK");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_70() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("yellow", "orange");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_71() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "OE");put("AGE", 35);put("CITY", "NEW YORK");put("COME", "$50,0000");put("John", "year");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_72() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("orange", "JoDooehn");put("Dooe", "JoDooehhn");put("LAST_NAME", "NK");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_73() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.6189164796316335);put("cItIY", 2.6443947966293897);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_74() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("yellow", "oDDOErange");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_75() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("cItY", "new yorrk");put("Income", "$50,000");put("CITY", "DOfDOlast_nameEirstNameE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_76() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "new yorAgek");put("Income", "$50,000");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_77() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("orange", "INCOMEJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_78() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", "Jane");put("", 35);put("fruuit", 34);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_79() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("orange", "ruuit");put("or$50,00ange", "fruui");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_80() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgekcolor");put("Income", "$50,000");put("firstN", "JohaJgeage");put("cItAGEY", "JJoDooehhnohaJgeage");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_81() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Anew");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_82() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 3.14159);put("IPI", 2.6443947966293897);put("Johageage", 2.9360614575298136);put("JohaJgeage", 3.14159);put("PPI", 2.9360614575298136);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_83() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "IP");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_84() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Anew");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("Last_Namme", "fruit");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_85() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 36);put("city", "New YorNk");put("income", "bana");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_86() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.6189164796316335);put("cItIY", 2.6443947966293897);put("New YorkLASTcity_NAMEPI", 2.3210819853008124);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_87() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "JIncomeyeyarohn");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_88() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("AGE", 35);put("CITY", "NEW YORK");put("COME", "$50,0000");put("John", "year");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_89() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "DOE");put("AGE", 35);put("INCOME", "$50,000");put("Age", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_90() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("new yorrk", 2.2762868739904514);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_91() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_92() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 36);put("income", "bana");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_93() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Age", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_94() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "new yorAgek");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("_FIRST_NAME", "JNew YorNke");put("new yorAgeIncIomekIncome", "1");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_95() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.6189164796316335);put("cItIY", 2.6443947966293897);put("I", 2.7107068449059466);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_96() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Joohn");put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "2");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_97() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "2");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_98() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("orange", "fruurit");put("or$50,00ange", "fruui");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_99() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DDOE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("LASTENAME", "Anew yorAgek");put("IncYorkLASTcity_NAMEPIIome", "Anenew yorAgeIncIomekw yorAgek");put("ageage", "cItYnew yorAgek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_100() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("orange", "fruurit");put("or$50,00ange", "fruui");put("orYoincomerk$50,00ange", "fruuritt");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_101() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "NNew YorkLASTcity_NAMEPIew York");put("tfirst_name", "JohJIncomeyeyarohnn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_102() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.9949170779000351);
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_103() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "2");put("Income", "$50,000");put("IncIome", "FIRfirstNam$50,0000eST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_104() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "1DOE");put("Age", "D");put("Income", "YorkLASTcity_NAMEPI");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_105() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "DYorNkoe");put("city", "New York");put("FIRST_NAME", "cherry");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_106() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.6189164796316335);put("cItIY", 2.6443947966293897);put("New YorkLAST_NALast_NammeMEPI", 0.8622214662877261);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_107() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Joohn");put("LASTNAME", "DOE");put("cItY", "2");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_108() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "clor");put("Age", "D");put("Income", "YORK");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_109() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("2", "banana");put("3", "cherry");put("Income", "NewYork");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_110() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_111() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.6189164796316335);put("cItIY", 2.6443947966293897);put("New YorkLASTcity_NAMEPI", 2.3210819853008124);put("NNew YorkLASTcity_NAMEPIew York", 2.2786871475765835);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_112() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("income", "$50,000");put("ageage", "Dooe");put("new yorok", "8");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_113() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("2", "banana");put("3", "cherry");put("Income", "New Yk");put("$50,000", "chrerry");put("Inconme", "bana");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_114() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 36);put("Income", "$50,000");put("8", "$0,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_115() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.6189164796316335);put("cItIY", 2.6443947966293897);put("I", 2.9360614575298136);put("8PI", 2.2268929884240265);put("JohJIncomeyeyarohnn", 1.9949170779000351);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_116() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_117() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Jooohn");put("LASTNAME", "DOE");put("cItY", "2");put("IncIome", "FIRST_NAME");put("Anew yorAgek", "FIRSTNAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_118() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Do");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Anew");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("Last_Namme", "fruit");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_119() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 36);put("Income", "$50,000");put("8", "$0,000");put("firslast_nametName", "cherry");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_120() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("1", "apple");put("2", "banana");put("3", "cherry");put("Income", "chINCEOMEerry");put("CITY3", "cherr");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_121() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("orange", "oDDOErange");put("or$50,00ange", "fruui");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_122() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("2", "banana");put("3", "cherry");put("$50,000", "chrerry");put("Inconme", "bana");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_123() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("1", "apple");put("2", "orange");put("3", "cherry");put("Income", "chINCEOMEerry");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_124() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("1", "apple");put("2", "orange");put("3", "cherry");put("Income", "chINCEOMEOerry");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_125() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Dooe", "fruuritt");put("LAST_NAAME", "JNew YorNkeJoDooehn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_126() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("cItIY", 2.6443947966293897);put("New YorkLAST_NALast_NammeMEPI", 0.8622214662877261);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_127() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("FIRST_NAME", "Jane");put("AAge", "Jcherrohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_128() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("Age", 35);put("city", "Newor$50,00ange York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Incoome", "oJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_129() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIomNNew YorkLASTcity_NAMEPIew Yorke", "CITY3");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_130() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("Age", 35);put("city", "Newor$50,00ange York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Incoome", "oJohn");put("", "oJoh");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_131() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "DYorNkoe");put("FIRST_NAME", "cherry");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_132() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.1459305021091426);put("cItIY", 2.6443947966293897);put("New YorkLASTcity_NAMEPI", 2.3210819853008124);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_133() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_134() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 36);put("cItY", "new yorrk");put("Income", "$50,000");put("CITY", "DOfDOlast_nameEirstNameE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_135() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Do");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Anew");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("Last_Namme", "fruit");put("fDOlast_nameEirstName", "NNewYork");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_136() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "OE");put("AGE", 35);put("COME", "$50,0000");put("YORK", "Anenew");put("Jcherrohn", "chINCEOMEerryAnenew");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_137() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DDOE");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_138() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Last_Name", "Do");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Anew");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("Last_Namme", "fruit");put("fDOlast_nameEirstName", "NNewYork");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_139() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("LAST_NAME", "$$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_140() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 35);put("city", "New YorNk");put("income", "$50,000");put("New Yk", "$5fruuritt0,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_141() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");put("cItY", "nenew yorAgeIncIomekw yorAgek");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_142() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("AGE", 35);put("INCOME", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_143() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("cItY", "new yorrk");put("CITY", "DOfDOlast_nameEirstNameE");put("CITTY", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_144() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "yorAgeIncIomek");put("age", 35);put("city", "New York");put("income", "$50,000");put("New Yk", 34);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_145() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("new yorrk", 2.2762868739904514);put("new ryorrk", 1.7300435058060522);put("new ryorLast_Namerk", 2.6443947966293897);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_146() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("firsnew yorAgektName", "new yogrAgek");put("ccItAGEYItY", "new yogrAgekk");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_147() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LAST_NAME", "DOE");put("AGE", 36);put("INCOME", "$50,000");put("Age", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_148() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Incoome", "kNew York");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_149() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("IncIncYorkLASTcity_NAMEPIIomelowome", "New YoJohageagek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_150() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("2019", "");put("20new yorrk19", "Newor$50,00ange");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_151() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("2", "banana");put("3", "cherry");put("Income", "chINCEOMEerry");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_152() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 35);put("city", "New York");put("income", "$50,000");put("ageage", "Inconme");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_153() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "DYorNkoe");put("city", "New York");put("FIRST_NAME", "cherry");put("Last_Namme", "yeyar");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_154() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 3.14159);put("IPI", 2.6443947966293897);put("Johageage", 2.9360614575298136);put("JohaJgeage", 3.14159);put("IIPI", 1.690316164828218);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_155() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Joohn");put("LASTNAME", "DOE");put("cItY", "2");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_156() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("Age", 36);put("Income", "$50,000");put("8", "$0,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_157() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("Newor$50,00ange", "NNewYork");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_158() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$0,000");put("FIRST_NAME", "Jane");put("1", 37);put("Incyellowome", "INCOMEJohn");put("IncIncYorkLASTcity_NAMEPIIomelowome", "New YoJohageagek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_159() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("yellow", "oraNewnge");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_160() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$0,000");put("FIRST_NAME", "Jane");put("1", 37);put("Incyellowome", "INCOMEJohn");put("IncIncYorkLASTcity_NAMEPIIomelowome", "New YoJohageagek");put("IncIncYorkLASJanelowome", "New");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_161() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new york");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_162() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("Age", 35);put("city", "NewNEWor$50,00ange York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Incoome", "oJohn");put("Agee", "$50,0oNew YorNk00");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_163() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "hJohn");put("LASTNAME", "DOE");put("Age", 35);put("Income", "$50,000");put("8", "$0,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_164() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "DOE");put("AGE", 35);put("INCOME", "$50,000");put("IfDOlast_nameEirstNameNCOME", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_166() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("or$50,00ange", "fruui");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_167() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "DOE");put("AGE", 35);put("CITY", "NEW YORK");put("COME", "$50,0000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_168() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Jooohn");put("LASTNAME", "YorNke");put("cItY", "2");put("IncIome", "FIRST_NAME");put("Anew yorAgek", "FIRSTNAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_169() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("Anenew", "INCOMEJJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_170() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("1", 36);put("Incyellowome", "INCOMEJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_171() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("firsnew yorAgektName", "new yorAgeIncIomekIncome");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_172() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Incyellowome", "INCOMEJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_173() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("new ryorrk", 1.7300435058060522);put("new ryorLast_Namerk", 2.6443947966293897);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_174() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "DOE");put("AGE", 35);put("INCOME", "$50,000");put("new yorAgek", "DOYorkLAST_NAMEPI");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_175() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("yelelow", "CyellOME");put("yelew", "New YorkLAST_NAMEPI");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_176() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "2");put("IncIome", "FIRfirstNam$50,0000eST_NAME");put("InceIome", "Last_Namme");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_177() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("Age", 35);put("city", "new yorAgek");put("Income", "$50,,000");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_178() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Dooe", "fruuritt");put("LAST_NAAME", "JNew YorNkeJoDooehn");put("Age", "ffruuritt");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_179() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Jooohn");put("LASTNAME", "YorNke");put("cItY", "2");put("IncIome", "yorAgeIncIomek");put("Anew yorAgek", "FIRSTNAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_180() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "new yorAgek");put("Income", "$50,000");put("_FIRST_NAME", "JNew YorNke");put("new yorAgeIncIomekIncome", "1");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_181() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("new yorrk", 2.2762868739904514);put("new yrk", 1.6108425454874835);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_182() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("Age", 35);put("city", "new yorAgek");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("DDOEIncome", "$50,00");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_183() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("yelelow", "CyellOME");put("yelew", "NewT_NAMEPI");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_184() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("firsnew yorAgektName", "new yorAgeIncIomekIncome");put("citty", "Jon");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_185() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "NewY York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Incom2019e", "Joh2,000n");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_187() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Incyellowome", "YorNk00");put("CITY", "Doe");put("yogrAgekk", "Do$$50,000e");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_188() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 36);put("cItY", "new yorok");put("Income", "$50,000");put("cItIY", 36);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_189() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.6189164796316335);put("cItIY", 2.6443947966293897);put("New YorkLASTcity_NAMEPI", 2.3210819853008124);put("New YorkLAST_NPAMEPI", 1.3462361524091344);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_190() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Incyellowome", "INCOMEJohn");put("first_namme", "$50,0last_name00");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_191() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("cItIY", 2.6443947966293897);put("New YorkLAST_NALast_NammeMEPI", 0.17904925194593924);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_192() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "2019n");put("LAST_NAME", "OE");put("AGE", 35);put("CITY", "NEW YORK");put("COME", "$50,0000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_193() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("last_name", "Doe");put("income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_194() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("firsnew yorAgektName", "new yogrAgek");put("ccItAGEYItY", "new yogrAgekk");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_195() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("last_name", "Doe");put("age", 35);put("city", "New York");put("ageage", "Inconme");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_196() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Age", 35);put("cItY", "new york");put("Income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_197() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "new yrk");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_198() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "2");put("Income", "$500,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_200() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "new yorAgek");put("Income", "$50,,000");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_201() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Jooohn");put("LASTNAME", "YorNke");put("cItY", "2");put("IncIome", "yorAgeIncIomek");put("Anew yorAgek", "FIRSTNAME");put("year", "first_name");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_202() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "2");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("Do", "EDOE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_203() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Joohn");put("LASTNAME", "DOE");put("cItY", "2");put("IncIome", "FIRST_NAME");put("Jon", "Joohnn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_204() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Joohn");put("LASTNAME", "DOE");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("LANewY YorkSTNAME", "OE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_205() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DDOE");put("Income", "$50,0000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_206() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("Income", "firsnew");put("firstsName", "YoincomerkD");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_207() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("cItY", "new yorrk");put("Income", "$50,000");put("CITY", "DOfDOlast_nameEirstNameE");put("NEW", "1");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_208() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");put("LASTNAE", "new yorAgeIncIomek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_209() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgekcolor");put("yorok", "Jooohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_210() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "2");put("Income", "$500,000");put("IncIome", "FIRST_NAME");put("Incomeyeyar", "AAge");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_211() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("Age", "bana");put("cItY", "new yorAgek");put("Income", "$00");put("LASTNAE", "new yorAgeIncIomek");put("Inc", "JNew");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_212() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", 36);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_213() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("COME", "$50,0000");put("John", "year");put("yorrk19", "yellow");put("income", "yelelow");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_214() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.6189164796316335);put("cItIY", 2.6443947966293897);put("I", 2.7107068449059466);put("CyellOME", 1.6243371737850312);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_215() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Dooe", "JoDooehhn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_216() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DDOE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("LASTENAME", "Anew yorAgek");put("cItcY", "DD");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_217() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");put("cItY", "nenew yorAgeIncIomekw yorAgek");put("Income", "$50,000NNewYork");put("IncIome", "FIRST_NAME");put("eAge", "Yoincomerk");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_218() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "oJohn");put("Last_Name", "DLAST_NAJohnMEe");put("city", "New York");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_220() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "2");put("Income", "$50eAge,000");put("IncIome", "Anenew yorAgeIncIomekw yorAgek");put("Do", "EDOE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_221() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.8117899160754405);
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_222() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("2019", "firstName");put("YorNk", "firstNe");put("NEW YORK", "fDOlast_nameEirstName");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_223() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.6189164796316335);put("I", 2.7107068449059466);put("CyellOME", 1.6243371737850312);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_224() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 2.7107068449059466);
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_225() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Do");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Anew");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("Last_Namme", "fruit");put("citiy", "8PI");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_226() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "OE");put("AGE", 35);put("CITY", "NEW YORK");put("COME", "$50,0000");put("YORK", "$50,00000");put("FIRFIRSTNAMEAME", "$ryorLast_Namerk50,00000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_227() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOcitiyE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_228() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "New York");put("FIRST_NAME", "Jane");put("Incyellowome", "INCOMEJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_229() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DODE");put("Age", "D");put("cItY", "new york");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_230() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", "Jane");put("CITY", "Doe");put("yogrAgekk", "Do$$50,000e");put("Last_eName", "JanLast_Namee");put("cItIY", "JafirstsNamee");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_231() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 2.2762868739904514);
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_232() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 3.14159);put("IPI", 2.6443947966293897);put("Johageage", 1.6108425454874835);put("JohaJgeage", 3.14159);put("PPI", 2.9360614575298136);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_233() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("Age", "D");put("Income", "KYORK");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_234() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("cItY", "new yorrk");put("Income", "$50,000");put("CITY", "DOfDOlasNew Yoincomerkt_nameEirstNameE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_235() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "IncIomNNew");put("Last_Name", "DYorNkoe");put("city", "New York");put("FIRST_NAME", "OE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_236() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "hJoohhn");put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "2");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("IncIomme", "DOfDOlasNew Yoincomerkt_nameEirstNameE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_237() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "JoDo$$50,000ehageage");put("Age", 35);put("cItY", "new york");put("Income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_238() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "New York");put("Income", "$hJoohhn50,000");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_240() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Johhn");put("LASTNAME", "DOE");put("Age", "D");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_241() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("Income", "$50,000");put("IncIomNNew YorkLASTcity_NAMEPIew Yorke", "CITY3");put("fruuit", "2,000");put("hJoohhn", "Johhn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_242() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "hJon");put("LASTNAME", "DOE");put("Age", 35);put("Income", "$50,000");put("8", "$0,000");put("IP", 36);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_243() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("Age", "IPI");put("cItY", "$50,,000");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("firsnew yorAgektName", "new yogrAgek");put("ccItAGEYItY", "new yogrAgekk");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_244() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Johhn");put("Age", "D");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_246() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", 36);put("Income", "$50,000");put("8", "$0,000");put("firslast_nametName", "cherry");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_247() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOlast_nameE");put("Age", 35);put("cItY", "new yorok");put("Income", "$50,000");put("cItIY", 37);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_248() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("Joohn", "DcItYnewOE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_249() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "JNew YorNkeJoDooehn");put("Age", "IPI");put("cItY", "2");put("Income", "$500,000");put("IncIome", "FIRST_NAME");put("Incomeyeyar", "AAge");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_250() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "I");put("cItY", "2");put("InceIome", "Last_Namme");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_251() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "oJohn");put("Last_Name", "DLAST_NAJohnMEe");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_252() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "IncIomNNew");put("city", "New York");put("FIRST_NAME", "OE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_253() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("Age", "D");put("Income", "firsnew");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_254() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOlast_nameOE");put("Age", 35);put("cItY", "new yochrrerryrok");put("Income", "$50,000");put("cItIY", 37);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_255() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 2.2762868739904514);put("new ryorrk", 1.7300435058060522);put("new ryorLast_Namerk", 2.6443947966293897);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_256() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Johon");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_257() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("cItAgee", "DOEnew yorAgeIncIomekIncome");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_258() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DODE");put("cItY", "new york");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_259() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("FIRST_NAME", "Jane");put("CITY", "Doe");put("yogrAgekk", "Do$$50,000e");put("Last_eName", "JanLast_Namee");put("cItIY", "JafirstsNamee");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_260() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "1DOE");put("Age", "D");put("Income", "YorkLASTcity_NAMEPI");put("AoraNewngege", "JNew YorkLAST_NAMEPIohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_261() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");put("cItY", "FIRSTNAME");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_262() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "DIncIome");put("cItY", "FIRSTNAME");put("Income", "$5DcItYnewOE0");put("IencIome", "FINew YorkLAST_NALast_NammeMEPIRSTNAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_263() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Income", "$50,000");put("8", "$0,000");put("$50,,000", "0$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_264() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");put("LASTNAE", "new yorAgeInDOfDOlasNew Yoincomerkt_nameEirstNameEcIomek");put("IncomNew YorkLAST_NAMEe", "new yorA$0,000geIncIomrek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_265() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Jooohn");put("LASTNAME", "YorNke");put("cItY", "2");put("IncIome", "FIRST_NAME");put("Anew yorAgek", "FIRSTNNAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_266() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Age", 35);put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_267() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Johnew yorAgekhn");put("Age", "D");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_268() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "D");put("Age", "D");put("Income", "YORK");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_269() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "DYorNkoe");put("FIRST_NAME", "cherry");put("Income", "cyherry");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_270() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "2");put("IncIome", "FIRfirstNam$50,0000eST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_271() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");put("cItY", "nenew yorAgeIncIomekw 2$0,000yorAgek");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_272() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", 36);put("cItAGEY", 36);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_273() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("AGE", 35);put("CITY", "NEW YORK");put("YORK", "$50,00000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_274() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_275() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 36);put("city", "New YorNk");put("income", "bana");put("year", 37);
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_277() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "color");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", "Jane");put("", 35);put("fruuit", 34);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_278() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("1chery", "$50,1DOE000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_279() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("new yorok", "2019n");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_280() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "hJon");put("LASTNAME", "DOE");put("Age", 35);put("Income", "$50,000");put("8", 36);put("IP", 36);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_281() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 2.9360614575298136);put("new ryorrk", 1.7300435058060522);put("new ryorLast_Namerk", 2.6443947966293897);put("new ryorLast$50,000NNewYork_Namerk", 1.7300435058060522);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_282() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("FIRST_NAME", 36);put("cItAGEY", 36);put("ageage", 36);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_283() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("orange", "JoDooehn");put("LAST_NAME", "NK");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_284() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "Jonew yorAgekcolorhn");put("Last_Name", "Doe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("Incoome", "kNew York");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_286() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Jooohn");put("LASTNAME", "YorNke");put("cItY", "2");put("IncIome", "FIRST_NAME");put("IncI$50,0000ome", "222");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_287() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Jooohn");put("LASTNAME", "DOE");put("cItY", "city");put("IncIome", "FIRST_NAME");put("Anew yorAgek", "FIRSTNAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_288() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "2");put("IncIome", "FIRfirstNam$500,0000eST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_289() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 36);put("city", "New YorNk");put("income", "bana");put("year", 38);
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_290() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_291() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "new yorAgek");put("Income", "$50,,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_292() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 35);put("city", "New York");put("income", "$50,000");put("ageage", "Dooe");put("new yorok", "8");put("Last_Name", "chge");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_293() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("I", "yorAgeIncIomekw");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_294() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LAST_NAME", "DOE");put("INCOME", "$50,000");put("Age", 37);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_295() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("city", "N8ew York");put("FIRST_NAME", "OE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_296() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("last_name", "Doe");put("age", 35);put("city", "New York");put("income", "$5Yoincomerkt_nameEirstNameEcIomek0,000");put("ageage", "Inconme");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_297() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");put("cItY", "NewYork");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_298() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "color");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", "Jane");put("", 34);put("fruuit", 34);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_299() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "nJane");put("1", 36);put("Incyellowome", "INCOMEJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_300() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DDOE");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIome", "cItAGEY");put("LASTENAME", "Anew yorAgek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_301() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("1", "apple");put("2", "banana");put("3", "cherry");put("Income", "hJohn");put("22", "Johhn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_302() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "new yorAgek");put("Income", "$50,,000");put("FIRST_NAME", "Jane");put("Anenew", "oJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_303() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "JohaInconmege");put("Age", 35);put("cItY", "new york");put("Incom", "Yoincomerkt_nameEirstNameEcIomek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_304() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("Age", "D");put("Income", "YORK");put("Aege", "nenew yorAgeIncIomekw yorAgek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_305() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 2.9360614575298136);put("new ryorrk", 1.7300435058060522);put("new ryorLast_Namerk", 2.6443947966293897);put("new ryorLast$50,000NNewYork_Namerk", 1.7300435058060522);put("IPI", 1.9949170779000351);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_306() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "new yorAgek");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Dooe", "firstNam$50,0000e");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_307() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("3", "cherry");put("Income", "New York");put("33", "8PI");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_308() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Jhohn");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgekcolor");put("firstN", "JohaJgeage");put("cItAGEY", "JJoDooehhnohaJgeage");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_309() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "clor");put("Age", "D");put("Income", "YORK");put("year", "Johnew yorAgekhn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_310() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("cItY", "new yorrk");put("Income", "$50,000");put("CITY", "DOfDOlast_nameEirstNameE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_311() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 35);put("income", "$50,000");put("new yorok", "8");put("DOcitiyE", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_312() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Age", 35);put("FIRST_NAME", "yorAgeIncIomekw");put("yorok", "yyorAgeIncIomekw");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_313() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "chery");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("chge", "New YorkLAST_NAME");put("New York", "new york");put("Incomge", "citty");put("Last_eName", "AGE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_314() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$0,000");put("FIRST_NAME", "Jane");put("1", 37);put("Incyellowome", "INCOMEJohn");put("IncIncYorkLASTcity_NAMEPIIomelowome", "New YoJohageagek");put("IncIncYorkLASJanelowome", "New");put("first_rname", "Nehw YoJohageagek");put("FIRS222T_NAME", "INCOMEJNohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_315() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("city", "N8ew York");put("FIRST_NAME", "OE");put("citty", "ONKE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_316() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", 36);put("cItAGEY", 36);put("firrstName", "chINCEOMEerryAnenew");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_317() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("3", "cherrfirstNy");put("$50,000", "chrerry");put("$50,00NewNEWor$50,00ange0", "age");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_318() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 2.9360614575298136);put("new ryorrk", 1.7300435058060522);put("new ryorLast_Namerk", 2.6443947966293897);put("new ryorLast$50,000NNewYork_Namerk", 1.7300435058060522);put("IPI", 1.9949170779000351);put("firstNe", 3.14159);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_319() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Anew");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("Incyelllowome", "$5YorNke0,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_320() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("2", "banana");put("3", "cherry");put("Income", "chINCEOMEerry");put("or$50,00ange", "bananAGEa");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_321() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Incyellowome", "INCOMEJohn");put("FIRSMT_NAME", "Jan2,000e");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_322() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Dooe", "fruuritt");put("Age", "ffruuritt");put("Anew yorrk", "1");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_323() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("orange", "Jon");put("or$50,00ange", "fruui");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_324() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "YORKNewY York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Incom2019e", "Joh2,000n");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_326() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Jooohn");put("LASTNAME", "YorNke");put("cItY", "2");put("Anew yorAgek", "FIRSTNAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_327() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "new chINCEOMEOerryyorAgek");put("Income", "$50,000");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_328() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "Jane");put("AAge", "Jcherrohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_329() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("city", "NK");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_330() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("cItY", "INCOME");put("Income", "$50,000");put("CITY", "DOfDOlast_nameEirstNameE");put("NEW", "1");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_331() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Do");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Anew");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("Last_Namme", "fruit");put("citiy", "8PI");put("FIRSTNAME", 38);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_332() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Age", 35);put("Income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_333() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 3.14159);put("IPI", 2.6443947966293897);put("Johageage", 2.9360614575298136);put("PPI", 2.9360614575298136);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_334() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "OE");put("AGE", 35);put("COME", "$50,0000");put("YORK", "Anenew");put("Jcherrohn", "chINCEOMEerryAnenew");put("chrerry", "Anennew");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_335() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("1", "apple");put("2", "banana");put("3", "Johhn");put("Jonew yorAgekcolorhn", "JohaInconmege");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_336() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Jhohn");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "YorNk");put("cItAGEY", "JJoDooehhZxdvjbwnohaJgeage");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_337() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yyork");put("fcityirstName", "nAgeeew york");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_338() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("FIRST_NAME", 36);put("LASTE", "cItY");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_339() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("cItY", "2");put("IncIome", "FIRST_NAME");put("LASTNAMTE", "Jonohn");put("N8ew York", "Jocyherrynohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_340() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "IncIomNNew");put("Last_Name", "DYorNkoe");put("FIRST_NAME", "OE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_341() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");put("cItY", "nenew yorAgeIncIomekw yorAgek");put("IncIome", "FIRST_NAME");put("eAge", "$50,000NNewYorkYoincomerk");put("AJan2,000ege", "DD");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_342() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("Income", "$50,,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_343() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D22");put("cItY", "nenew yorAgeIncIomekw yorAgek");put("Income", "$50,000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_344() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("IncIom", "FINew YorkLAST_NALast_NammeMEPIRSTNAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_345() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "I2");put("cItY", "2");put("InceIome", "Last_Namme");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_346() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");put("LASTN", "DD");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_348() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Age", 35);put("city", "New York");put("FIRST_NAME", "nJane");put("1", 36);put("Incyellowome", "INCOMEJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_349() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIomNNew YorkLASTcity_NAMEPIew Yorke", "yorAgek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_350() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_351() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "2");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("Do", "EDOE");put("cItYJocyherrynohn", "Joohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_352() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "ONKE");put("Income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_353() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Jooohn");put("LASTNAME", "YorNke");put("cItY", "2");put("IncIome", "yorAgeIncIomek");put("Anew yorAgek", "FIRSTNAME");put("cIttY", "JooohyorAgeIncIomekn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_354() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "2");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_355() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 36);put("city", "new chINCEOMEOerryyorAgek");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_356() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "YorNke");put("cItY", "2");put("IncIome", "yorAgeIncIomek");put("Anew yorAgek", "FIRSTNAME");put("cIttY", "JooohyorAgeIncIomekn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_357() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 37);put("city", "New YorNk");put("income", "bana");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_358() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("Income", "$50,000");put("Ag", "new y");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_359() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("IncIncYorkLASTcity_NAMEPIIomelowome", "New YoJohageagek");put("Last_e", "Yoincomerk");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_360() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Last_Name", "DYorNkoe");put("FIRST_NAME", "cherry");put("Income", "cyherry");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_361() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.6189164796316335);put("cItIY", 2.6443947966293897);put("New YorkLASTcity_NAMEPI", 2.3210819853008124);put("New YorkLAST_NPAMEPI", 1.3462361524091344);put("$$50,000", 2.79480680351591);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_362() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("city", "New York");put("FIRST_NAME", "nJane");put("1", 38);put("Incyellowome", "INCOMEJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_364() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("cItY", "new yorrk");put("CITY", "DOfDOlast_nameEirstNameE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_365() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("IncIome", "FIRST_NAMIE");put("new yorok", "2019n");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_366() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("IncIome", "Anenew yorAgeIncIomekw yorAgek");put("Do", "EDOE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_367() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("IncomJohhne", "DEOE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_368() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("cItY", "new yorok");put("Income", "$50,000");put("cItIY", 36);put("2", "Yk");put("cItIYY", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_369() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "2019n");put("LAST_NAME", "OE");put("AGE", 35);put("CITY", "NEW YORK");put("COME", "$50,0000");put("LASTNAECOME", 37);
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_370() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("cItY", "new yorok");put("Income", "$50,000");put("cItIY", 36);put("2", "Yk");put("cItIYY", 35);put("cItIYYnew ryorrk", "Yk2,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_371() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D22");put("cItY", "nenew yorAgeIncIomekw yorAgek");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("CyellOMEcItY", "chge");put("cIctY", "DOE33");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_372() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "New Yrork");put("Income", "$50,000");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_373() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("last_name", "Doe");put("age", 35);put("city", "AoraNewngegeNew York");put("income", "$5Yoincomerkt_nameEirstNameEcIomek0,000");put("ageage", "Inconme");put("LASTENAMEage", "$5Yoincomerkt_nameEirsttNameEcIomek0,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_374() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("1chery", "$50,1DOE000");put("DOEnew yorAgeIncIomekIncome", "ONKE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_375() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("2", "banana");put("3", "cherry");put("Income", "chINCEOMEerry");put("Incomge", "new yorAgeIncIomek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_376() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("1", 36);put("Incyellowome", "INCOMEJohn");put("cityyorA$0,000geIncIomrek", "JJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_377() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Age", "IPI");put("IncIome", "FIRfirstNam$500,0000eST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_378() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "JohnoNew YorNk");put("LASTNAME", "DDOE");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("DIncome", "YorkLASTcity_NAMEPIew");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_379() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("IncIome", "FIRST_NAME");put("cItAgee", "DOEnew yorAgeIncIomekIncome");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_380() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOlast_nameOE");put("Age", 35);put("cItY", "new yochrrerryrok");put("cItIY", 37);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_381() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 36);put("Income", "$50,,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_382() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 3.14159);put("Johageage", 2.9360614575298136);put("JohaJgeage", 3.14159);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_383() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Johhn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_384() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "new yorAgek");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("DDOEIncome", "$50,00");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_385() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "new chINCEOMEOerryyorAgek");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Jonew", "new chINCEOMEOeoDDOErangerryyorAgek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_386() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", "Jacityne");put("Incyellowome", "INCOMEJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_387() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Johnbana");put("Age", "D");put("Income", "KYORK");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_388() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "new yorAgek");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("DDOEIncome", "$50,00");put("citcy", "$50,00New YorkLAST_NALast_NammeMEPI0");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_389() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "Yk2,000");put("Last_Name", "Do");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Anew");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "0$50,00");put("Last_Namme", "fruit");put("citiy", "8PI");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_390() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 1.2679847915686973);put("cItIY", 2.6443947966293897);put("New YorkLASTcity_NAMEPI", 2.3210819853008124);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_391() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_392() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Last_Name", "Doe");put("Age", 36);put("city", "New York");put("Income", "$50,000");put("Incoome", "kNew York");put("AAge", "cIttY");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_393() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("orange", "JoDooehn");put("okNewrange", "INCOMEJJohn");put("orangae", "YorkLAST_NALast_NammeMEPI0JoDooehn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_394() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Anew");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,$00");put("Last_Namme", "fruit");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_395() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "2");put("yogrAgek", "YorkSTNAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_396() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "IncIomNNew");put("Last_Name", "DYorNkoe");put("city", "NewCyellOME York");put("FIRST_NAME", "ODOlast_nameOEE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_397() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "New York");put("FIRST_NAME", "cherry");put("ryorrk", "Jnohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_398() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "yorAgeIncIomekw");put("Income", "$500,000");put("IncIome", "FIRST_NAME");put("Incomeyeyar", "AAge");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_399() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("last_name", "Doe");put("age", 35);put("city", "New York");put("income", "$5Yoincomerkt_namAneneweEirstNameEcIomek0,000");put("ageage", "Inconme");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_400() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("IncIncYorkLASTcity_NAMEPIIomelowome", "New YoJohageagek");put("Last_e", "Yoincomerk");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_401() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "new yorAgek");put("Income", "$5Yoincomerkt_nameEirstNameEcIomek0,000");put("FIRST_NAME", "Jane");put("Dooe", "firstNam$50,0000e");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_402() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("$50,000", "chrerry");put("Inconme", "bana");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_403() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("Age", 35);put("city", "new yorAgek");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("DDOEIncome", "$50,00");put("citty", 38);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_405() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("cItY", "IencIome");put("Income", "$50,00FIRSTNNAME0");put("CITY", "DOfDOlast_nameEirstNambananAGEaeE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_406() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("new yorrk", "8");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_407() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("2", "banana");put("2$0,000", "chery");put("orYoincomerk$50,00ange", "yochrrerryrok");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_408() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 2.9360614575298136);put("new ryorrk", 1.7300435058060522);put("new ryorLast_Namerk", -21.558299894752437);put("new ryorLast$50,000NNewYork_Namerk", 1.7300435058060522);put("IPI", 1.9949170779000351);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_409() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("cItY", "new yorAgek");put("Income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_410() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", 36);put("cItAGEY", 36);put("firrstName", "w");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_411() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("city", "NNew YorkLASTcity_NAMEPIew York");put("tfirst_name", "2JohJIncomeyeyarohnn");put("Last_Naeme", "DoYorke");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_412() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "yorAgekcolorhnJohhn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_413() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("Last_eName", "JanLast_Namee");put("cItIY", "JafirstsNamee");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_414() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "hJon");put("LASTNAME", "DOE");put("Age", 35);put("8", 36);put("IP", 36);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_415() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Jooohn");put("LASTNAME", "YorNke");put("IncIome", "yorAgeIncIomek");put("Anew yorAgek", "FIRSTNAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_416() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.6189164796316335);put("cItIY", 2.6443947966293897);put("I", 2.496132463875833);put("CyellOME", 1.6243371737850312);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_417() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("1", "aple");put("2", "banana");put("Income", "chINCEOMEerry");put("CITY3", "cherr");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_418() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("orange", "fruurit");put("or$50,00ange", "fruui");put("orYoincomerk$50,00ange", "fruYoincomerkuritt");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_419() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DDOE");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIome", "cItAGEY");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_420() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.6189164796316335);put("cItIY", 2.6443947966293897);put("I", 1.4713856995958976);put("CyellOME", 1.6243371737850312);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_421() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("cItIY", 2.6443947966293897);put("New YorkLAST_NALast_NammeMEPI", 0.17904925194593924);put("New YorkLALASTENAMEageST_NALast_NammeMEPI", 2.2786871475765835);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_422() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("AGE", 35);put("YORK", "$50,00000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_423() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "OE");put("AGE", 35);put("CITY", "NEW YORK");put("YORK", "$50,00000");put("FIRFIRSTNAMEAME", "$ryorLast_Namerk50,00000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_424() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("orange", "JoDooehn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_425() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("Age", "0$50,00");put("Income", "YORK");put("Aege", "nenew yorAgeIncIomekw yorAgek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_426() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("3", "cherry");put("Income", "chINCEOMEerry");put("Inncome", "chINCffruurittEOMEerry");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_427() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("cItY", "new yorrk");put("Income", "$50,000");put("CITY", "DOfDOlasNew Yoincomerkt_nameEirstNameE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_428() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "YorNke");put("cItY", "2");put("IncIome", "FIRST_NAME");put("IncI$50,0000ome", "222");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_429() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 0.9299554777703931);put("cItIY", 2.6443947966293897);put("New YorkLAST_NALast_NammeMEPI", 0.17904925194593924);put("New YorkLALASTENAMEageST_NALast_NammeMEPI", 2.2786871475765835);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_430() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("Income", "color");put("Dooe", "firstNam$50,0000e");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_431() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 36);put("Income", "$50,,000");put("Aege", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_432() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "Johnn");put("Last_Name", "Doe");put("Income", "color");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_433() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "DYorNkoe");put("FIRST_NAME", "cherry");put("Last_Namme", "yeyar");put("LasYorkLAST_NALast_NammeMEPI0t_Namme", "yer");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_435() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("AGE", 35);put("CITY", "NEW YcIctYORK");put("YORK", "$50,00000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_436() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("cItY", "new yorAgek");put("Income", "$50,000");put("firstNfame", "new yorAgekcolor");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_437() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "Jonew yorAgekcolorhn");put("Last_Name", "Doe");put("Age", 35);put("city", "New York");put("Incoome", "kNew York");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_438() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 35);put("city", "oNNew YorNk");put("income", "DD");put("Newage", "2,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_439() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Incyellowome", "YorNk00");put("CITY", "Doe");put("yogrAgekk", "Do$$50,000e");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_440() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Last_Name", "Doe");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_441() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "IP");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("eAge", "FIRSJhohnT_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_442() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("last_name", "Doe");put("age", 35);put("city", "New YorNk");put("income", "$50,000");put("chINCffruurittEOMEerry", "$5Yoincomerkt_nameEirstNameEcIomek0,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_443() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.6189164796316335);put("cItIY", 1.4094949772734846);put("I", 2.7107068449059466);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_444() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DDOE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("LASTENAME", "Anew yorAgek");put("IncYorkLASTcity_NAMEPIIome", "Anenew yorAgeIncIomekw yorAgek");put("ageage", "cItYnew yorAgek");put("2019n", "IPI");put("12019n", "DJohnew yorAgekhn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_445() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "New York");put("Income", "$0,000");put("FIRST_NAME", "Jane");put("1", 37);put("Incyellowome", "INCOMEJohn");put("IncIncYorkLASTcity_NAMEPIIomelowome", "New YoJohageagek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_446() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "new chINCEOMEOerryyorAgek");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_447() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 36);put("Income", "$50,000");put("8", "chINCEOMEOerryyorAgek");put("firslast_nametName", "cherry");put("", "apple");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_448() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Age", "D");put("cItY", "nenew yorAgeIncIomekw 2$0,000yorAgek");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_449() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("1", "apple");put("2", "tfirst_name");put("Income", "hJohn");put("22", "Johhn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_450() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "IPI");put("cItY", "new yorAgek");put("Income", "$5Yoincomerkt_nameEirstNameEcIomek0,000");put("IncIome", "FIRST_NAME");put("firsnew yorAgektName", "new yogrAgek");put("ccItAGEYItY", "new yogrAgekk");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_451() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 1.7300435058060522);put("New YorkLAST_NAMEPI", 2.6189164796316335);put("cItIY", 2.6443947966293897);put("New YorkLASTcity_NAMEPI", 2.3210819853008124);put("ccItIY", 2.9039294830493683);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_453() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "INCOMEJNohn");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("Newor$50,00ange", "NNewYork");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_454() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("LAST_NAME", "DOE");put("AGE", 35);put("INCOME", "$50,000");put("LAScItIYYnewT_NAME", "cyherry");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_455() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Age", 35);put("FIRST_NAME", "Jane");put("firstNam$50,0000e", 38);put("DOfDOlast_nameEirstNambananAGEaeE", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_456() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_458() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("city", "new yorAgek");put("Income", "$50,,000");put("ncome", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_459() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("cItY", "new york");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_460() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 36);put("Income", "$50,000");put("8", "$0,000");put("222", "$york");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_461() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 3.14159);put("IPI", 2.6443947966293897);put("JohaJgeage", 3.14159);put("PPI", 2.9360614575298136);put("PPDDOEI", 1.8117899160754405);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_462() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("COME", "$50,0000");put("John", "year");put("yorrk19", "yellow");put("income", "yelelow");put("yorrk1", "orangae");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_463() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "Jane");put("AAge", "Jchenrrohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_464() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("Income", "$50,000");put("1", 36);put("Incyellowome", "INCOMEJohn");put("cityyorA$0,000geIncIomrek", "JJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_465() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "$50,000NNewYorkYoincomerkyorAgekkcolorhnJohhn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_466() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 3.14159);put("IPI", 2.6443947966293897);put("Johageage", 3.7806371669520606);put("JohaJgeage", 3.14159);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_467() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("3", "cheryrfirstNy");put("$50,000", "chrerry");put("$50,00NewNEWor$50,00ange0", "age");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_468() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("orange", "fruurit");put("or$50,00ange", "fruui");put("orYoincomerk$50,00ange", "fruuritt");put("or$50,00ang", "frageuui");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_469() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("Age", 35);put("city", "Newor$50,00ange York");put("Income", "nenew yorAgeIncIomekw 2$0,000yorAgek");put("FIRST_NAME", "Jane");put("Incoome", "oJohn");put("", "oJoh");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_470() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("PI", 2.2762868739904514);put("new ryorrk", 1.7300435058060522);put("new ryorLast_Namerk", 2.6443947966293897);put("new ryYrorkorLast_Namerk", -48.45477875780888);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_471() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "Jane");put("AAge", "Jcherrohn");put("$50,000NNewYorkYoincomerk", "IencIome");put("new yogrAgekk", "JcherrocItYJocyherrynohnhn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_472() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooee");put("Age", 35);put("Income", "tfirst_name");put("FIRST_NAME", "Jane");put("Incyellowome", "INCOMEJohn");put("first_namme", "$50,0last_name00");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_473() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 36);put("Income", "$50,000");put("8", "$0,000");put("IncoDDOErangeome", "$550,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_474() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Agee", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_475() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("2", "VNxJOt");put("Income", "New York");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_476() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "hJohn");put("LASTNAME", "DOE");put("Age", 35);put("Income", "$50,000");put("8", "$0,000");put("LASTNAAME", "citcy");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_477() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "New York");put("Income", "Dooe");put("FIRST_NAME", "Jane");put("1", 37);put("Incyellowome", "INCkNew YorkOMEJohn");put("chINCEOMEerryAge", "$50,00");put("firsnew yorAgektName", "new yorAgeIncIomekIncome");put("citty", "Jon");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_478() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("IncIncYorkLASTcity_NAMEPIIomelowome", "New YoJohageagek");put("Last_e", "Yoincomerk");put("Incyellowe", "Jancherre");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_480() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("Age", "D");put("IncIome", "FIRST_NAME");put("IncomJohhne", "DEOE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_481() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("Income", "$50,000");put("Ag", "new y");put("firstJohJIncomeyeyarohnnName", "JYORKNewYohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_482() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("AGE", 36);put("INCOME", "$50,000");put("Age", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_483() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 36);put("city", "new yorAgek");put("FIRST_NAME", "33K");put("Anenew", "oJohn");put("Inme", "oJoJhn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_484() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("firAEst_name", "JaJne");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_485() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("city", "new yorAgek");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_486() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", "Jane");put("Incyellowome", "YorNk00");put("CITY", "Doe");put("yogrAgekk", "Do$$50,000e");put("AyorAgek", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_487() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooe");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("IncIncYorkLASTcity_NAMEPIIomelowome", "New YoJohageagek");put("Last_e", "Yoincomerk");put("Incyellowe", "JYORKNewYohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_488() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("IncIome", "FIRST_NAMIE");put("new yorok", "2019n");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_489() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Last_Name", "Do");put("Age", 35);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Anew");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("Last_Namme", "fruit");put("fDOlast_nameEirstName", "NNewYork");put("Nehw", "PPnew chINCEOMEOerryyorAgekI");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_490() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("yellow", "color");put("yell", "clor");put("yellowAnenew", "YorNk");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_491() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "Jooohn");put("Anew yorAgek", "FNIRSTNAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_492() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("last_name", "Doe");put("age", 35);put("city", "New York");put("cit", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_493() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Dooee");put("Age", 35);put("Income", "tfirst_name");put("FIRST_NAME", "Jane");put("Incyellowome", "INCOMEJohn");put("first_namme", "$50,0last_name00");put("Aclor", "INCOMEJLANewYohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_494() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("1", "apple");put("2", "orange");put("3", "cherry");put("Income", "chINCEOMEerry");put("banana2", "chINCEEOMEerry");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_495() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "8PI");put("cItY", "2");put("IncIome", "yorAgeIncIomek");put("Anew yorAgek", "FIRSTNAME");put("cIttY", "JooohyorAgeIncIomekn");put("IncIocme", "JoDooehhn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_496() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "IncIomNNew");put("FIRST_NAME", "OE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_497() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LAST_NAME", "oJoh");put("AGE", 35);put("CITY", "NK");put("1", 34);put("AE", "new");put("QxxTRMjexO", "oJhoh");put("TCITY", 34);
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_498() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", "D");put("cItY", "new yorAgek");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("LASTENAME", "Anew yorAgek");put("cItcY", "DD");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_499() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("FIRST_NAME", "John");put("AGE", 35);put("CITY", "NEW YORK");put("INCOME", "$50,000");put("INCNewT_NAMEPIOME", "NEW");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_500() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Last_Name", "Dooe");put("Age", 35);put("city", "chery");put("Income", "$50,000");put("FIRST_NAME", "Jane");put("1", 36);put("Incyellowome", "INCOMEJohn");put("chINCEOMEerryAge", "$50,00");put("chge", "New YorkLAST_NAME");put("New York", "new york");put("Incomge", "citty");put("Last_eName", "AGE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_501() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "yorAgekcoJoDo$$50,000ehageagelorhnJohhn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_502() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("LASTNAME", "DOE");put("cItY", "2");put("Income", "$50,000");put("IncIome", "FIRST_NAME");put("Do", "EDOE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_503() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("Income", "$50,000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_504() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("or$50,00ange", "fruui");put("orYoincomerk$50,00ange", "fruuritt");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_505() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "JohDOE33");put("LASTNAME", "DDOE");put("Income", "$50,0000");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_506() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Last_Name", "Doe");put("Age", 35);put("city", "NewNEWor$50,00ange York");put("Income", "$50,000");put("FIRST_NAME", "eJane");put("Incoome", "oJohn");put("Agee", "$50,0oNew YorNk00");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_507() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("Income", "$50,000");put("FIRST_NAME", 36);put("LASTNASME", "oJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_508() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("city", "New York");put("Income", "$50,000");put("1", 36);put("Incyellowome", "2$0,000");put("cityyorA$0,000geIncIomrek", "JJohn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_509() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "NNew");put("LASTNAME", "DDOE");put("Income", "$50,0000");put("IncIome", "FIRST_NAME");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_510() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("firstName", "John");put("LASTNAME", "DOE");put("Age", 35);put("cItY", "new yorrk");put("Income", "$50,000");put("CITY", "DOfDOlast_nameEirstNameE");put("NEW", "1");put("ge", "nNew YorkLAST_NPAMEPIew yorrk");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_511() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("last_name", "new yorrkoe");put("age", 36);put("city", "New YorNk");put("income", "bana");put("year", 37);
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_512() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("city", "new yorAgek");put("ncome", 35);
            }}
        );
        org.junit.Assert.assertEquals(
            result, true
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_513() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("last_name", "Doe");put("age", 35);put("city", "oNew YorNk");put("income", "$50,000");put("Newage", "2,000");put("first_nam", "JohnDOfDOlasNew Yoincomerkt_nameEirstNameE");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_514() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 36);put("city", "New York");put("Income", "$50,000");put("FIRST_NAME", "Jane");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
    @org.junit.Test(timeout = 1000)
    public void test_515() throws java.lang.Exception {
        boolean result = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{
                put("first_name", "John");put("Age", 36);put("city", "new yorAgek");put("FIRST_NAME", "33K");put("Anenew", "oJohn");put("Inme", "oJoJhn");put("Yrork", "oJoJhkNewn");
            }}
        );
        org.junit.Assert.assertEquals(
            result, false
        );
    }
}




