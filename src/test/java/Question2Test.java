import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class Question2Test {

    Integer[] array = {3592, 2974, 1796, 2983,6281, 9462, 6283, 8391, 9166, 6634, 3457};
    Integer source = 9462;
    Integer target = 3457;

    @org.junit.jupiter.api.Test
    void Input_Array_Return_True(){
        List<Integer> expected = new ArrayList<Integer>() {{
            add(9462);
            add(6283);
            add(8391);
            add(9166);
            add(6634);
            add(3457);
        }};
        List<Integer> actual = Question2.validChain(array,source,target);
        assertEquals(expected, actual);
    }

}