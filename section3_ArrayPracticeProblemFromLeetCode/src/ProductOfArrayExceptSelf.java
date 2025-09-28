import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {2,3,1,5};
        System.out.println(Arrays.toString(productExceptSelf2(nums)));
    }

//  way 1:
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

//   way 2:
    public static int[] productExceptSelf2(int[] nums) {
        int[] result = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        right[nums.length - 1] = 1;

        //[1,2,4]
        //Left store 0: 1, 1: num[0], 2: num[0] * num[1]
        //Right store 0: num[2] * num[1], 1: num[2], 2: 1

        //left[1] = left[0] * nums[0];
        //left[2] = left[1] * nums[1];
        for(int i = 1; i < nums.length; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }

        //right[4] = 1;
        //right[3] = right[4] * nums[4];
        //right[2] = right[3] * nums[3];
        for(int i = nums.length - 2; i >= 0; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }

        for(int i = 0; i < nums.length; i++){
            result[i] = left[i]*right[i];
        }
        return result;
    }
}
