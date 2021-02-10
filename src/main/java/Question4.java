import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Question4 {

    public static String SimplifiedTagsCounts (String[] tagsList){
        if (tagsList.length == 0)
            return null;
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String tag : tagsList ){
            String[] subtags = tag.split(",");
            for (String subtag : subtags){
                if (map.containsKey(subtag)){
                    map.put(subtag, map.get(subtag) + 1);
                }else{
                    map.put(subtag,1);
                }
            }
        }



        return map.entrySet().stream().sorted((a,b) -> a.getKey().compareTo(b.getKey())).map( entry -> "'" + entry.getKey() + "': "+entry.getValue()).collect(Collectors.joining(",","{","}"));
    }
}
