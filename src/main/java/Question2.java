import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question2 {
    public static List<Integer> validChain(Integer[] initChain, Integer source, Integer target){
        List<Integer> validChain = new ArrayList<Integer>();
        validChain.add(source);
        if (!canGetTarget(initChain, source, target, validChain))
            validChain.remove(source);
        return validChain;
    }

    private static boolean canGetTarget(Integer[] initChain, Integer source, Integer target, List<Integer> validChain){
        List<Integer> possibleChildren = Stream.of(initChain).filter(t -> t/100 == source%100 && !validChain.contains(t))
                                        .collect(Collectors.toList());
        if (possibleChildren.isEmpty()){
            return false;
        }
        else if (possibleChildren.contains(target)){
            validChain.add(target);
            return true;
        }

        for (Integer item : possibleChildren){
            validChain.add(item);
            boolean canGetTarget = canGetTarget(initChain, item, target, validChain);
            if (!canGetTarget) {
                validChain.remove(item);
            }else{
                return true;//true
            }
        }

        //all the child failed
        return false;
    }
}
