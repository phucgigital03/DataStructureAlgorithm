import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("TwoSum with phuc digital");
        int[] nums = {3,2,4};
        int target = 6;
        Arrays.stream(twoSum(nums, target)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> numPair = new HashMap<>();
        return nums;
    }

//    public static int[] twoSum(int[] nums, int target) {
////        Map<Integer, Integer> numPair = new HashMap<>();
//        int len = nums.length;
//        int[] result = new int[2];
//        for (int i = 0; i < len; i++) {
//            for(int j = i + 1; j < len; j++) {
//                if(nums[i] + nums[j] == target){
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
//        return result;
//
//    }
//

}
