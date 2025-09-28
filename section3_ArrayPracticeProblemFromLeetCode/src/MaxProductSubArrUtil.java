public class MaxProductSubArrUtil {


    public static int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];
//      [2, 4, -2, -1]
//        -2: max -> -2, min: -16
//        -1: max -> 16, min: -1
//        [2, 4, -2, 4]
//        -2: max -> -2, min: -16
//        4: max->4, min: -16x4
        for(int i = 1; i < nums.length; i++){
            if(nums[i] >= 0){
//
                maxSoFar = Math.max(nums[i], maxSoFar * nums[i]);
                minSoFar = Math.min(nums[i], minSoFar * nums[i]);
            }else{
//              minus lan 1, minus lan 2
                int temp = maxSoFar;
                maxSoFar = Math.max(nums[i], minSoFar * nums[i]);
                minSoFar = Math.min(nums[i], temp * nums[i]);
            }

            result = Math.max(result,maxSoFar);
        }
        return result;
    }


}
