import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println("ThreeSum with phuc digital");
        int[] nums = {-1,0,1,2,-1,-4};
        int[] nums2 = {0,1,1};
        int[] nums3 = {0,0,0};
        int[] nums4 = {-100,-70,-60,110,120,130,160};
        int[] nums5 = {1,2,-2,-1};
        threeSum(nums4).forEach(ele -> {
            System.out.println(ele.toString());
        });
    }

    public static Set<List<Integer>> checkReachNumber(int[] nums, int target, int currInd){
        int i = 0;
        Set<List<Integer>> result = new HashSet<>();
        while(i < nums.length){
            if(i == currInd){
                i++;
                continue;
            }
            for(int j = i + 1; j < nums.length; j++){
                if(j == currInd){
                    continue;
                }
                if(nums[j] + nums[i] == -target){
                    List<Integer> list = new ArrayList<>();
                    list.add(target);
                    list.add(nums[j]);
                    list.add(nums[i]);
                    Collections.sort(list);
                    result.add(list);
                }
            }
            i++;
        }

        return result;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        for(int j = 0; j < nums.length; j++){
            Set<List<Integer>> found = checkReachNumber(nums, nums[j], j);
            result.addAll(found);
        }
        return result.stream().toList();
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        return null;
    }
}

