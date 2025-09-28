import java.util.Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,0,1,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int currentCount = 0;
        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                if (currentCount > result) {
                    result = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        return result;
    }
}
