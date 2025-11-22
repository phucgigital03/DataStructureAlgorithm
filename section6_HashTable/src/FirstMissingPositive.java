import java.util.HashSet;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println("FirstMissingPositive with phuc digital");
        int[] nums = {1,2,0};
        int[] nums1 = {3,4,-1,1};
        int[] nums2 = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int len = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            if(nums[i] > 0){
                set.add(nums[i]);
            }
        }
        for(int i = 1; i <= set.size() + 1; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }
}
