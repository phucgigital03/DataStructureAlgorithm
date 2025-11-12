import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println("ValidAnagram with phuc digital");
        System.out.println(isAnagram2("rat", "tra"));
    }

    public static boolean isAnagram(String s, String t) {
        Map<String,Integer> map = new HashMap<>();
        return false;
    }

    public static boolean isAnagram2(String s, String t) {
        Map<String,Integer> map = new HashMap<>();
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        String result = new String(sArr);

        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);
        String result2 = new String(tArr);

        System.out.println(result);
        System.out.println(result2);
        return result.equals(result2);
    }

}
