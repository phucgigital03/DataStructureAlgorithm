

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int multiplyEle = 1;
            for(int j = 0; j < nums.length; j++){
                if(j == i){
                    continue;
                }
                multiplyEle *= nums[j];
            }
            result[i] = multiplyEle;
        }
        return result;
    }
}
