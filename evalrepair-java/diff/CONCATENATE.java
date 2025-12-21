package humaneval.buggy;

public class CONCATENATE {
    public static String concatenate(String[] strings) {
// buggy code
//         String result = null;
                <FILL_ME>
        for (String string : strings)
            result += string;
        return result;
    }
}
