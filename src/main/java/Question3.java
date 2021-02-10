import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public static int[] lengthEncoding (int[] array){
        if (array == null || array.length == 0){
            return null;
        }
        List<Integer> listEncoded = new ArrayList<Integer>();
        int current = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++){
            if (array[i]==current){
                count++;
            }else if (array[i]!=current){
                listEncoded.add(count);
                listEncoded.add(current);
                current = array[i];
                count = 1;
            }
        }
        // add the last encoded elements
        listEncoded.add(count);
        listEncoded.add(current);

        return listEncoded.stream().mapToInt(i -> i).toArray();
    }
}
