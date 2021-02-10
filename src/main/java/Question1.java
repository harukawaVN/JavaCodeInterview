import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Question1 {
    private static HashMap< Character, Character> map = new HashMap<Character,Character>(){{ put('(',')'); }};
    private static List<Character> support = new ArrayList<Character>()
    {{
        add('(');
        add(')');
    }};

    public static boolean isBalance(String str){
        Stack<Character> stack = new Stack<Character>();
        if (str == null || str.length() == 0){
            return false;
        }

        if (!str.contains("(") || !str.contains(")"))
            return false;
        for(char c : str.toCharArray()){
            if (Character.isLetterOrDigit(c) || !support.contains(c))
                continue;
            if (map.containsKey(c)){
                stack.push(c);
            }else if (stack.isEmpty() || map.get(stack.pop()) != c){
                return false;
            }
        }
        return true;
    }
}
