package humaneval.buggy;

import java.util.List;

public class MAX_ELEMENT {
    public static int max_element(List<Integer> l) {
// buggy code
//         int m = 0;
                <FILL_ME>
        for (Integer e : l) {
            if (e > m){
                m = e;
            }
        }
        return m;
    }
}
