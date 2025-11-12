import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println("GroupAnagrams with phuc digital");
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs).forEach(sArr -> {
            System.out.println(sArr.toString());
        });
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(!map.containsKey(sorted)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sorted, list);
            }else{
                map.get(sorted).add(str);
            }
        }
        map.forEach((k,v)->{
            result.add(v);
        });
        return result;
    }
}
