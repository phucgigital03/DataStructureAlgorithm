import java.util.Arrays;

public class RotateArr {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        // length of arr is 7
        // Expected: 5 6 7 1 2 3 4
        // 1. 7 6 5 4 3 2 1
        // 2. 5 6 7 4 3 2 1
        // 3. 5 6 7 1 2 3 4
        int k = 4;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        reverse(nums, 0, length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        int i = start, j = end;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
