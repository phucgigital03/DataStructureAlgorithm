import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println("ContainsDuplicate with phuc digital");
        int[] nums = {1,2,3,4};
        System.out.println("check: "+ containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }else{
                map.put(nums[i], i);
            }
        }
        return false;
    }

}
