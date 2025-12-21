package humaneval.buggy;

import java.util.ArrayList;
import java.util.List;

public class FILTER_BY_PREFIX {
    public static List<String> filter_by_prefix(List<String> strings, String prefix) {
        List<String> result = new ArrayList<String>();

        for (String string : strings){
// buggy code
//             if (string.startsWith(prefix, 1)){
                <FILL_ME>
                result.add(string);
            }
        }
        return result;
    }
}
