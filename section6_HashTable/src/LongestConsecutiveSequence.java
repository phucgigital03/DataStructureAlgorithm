import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println("LongestConsecutiveSequence with phuc digital");
        int[] nums = {100,4,200,1,3,2};
        System.out.println("number of longest consecutive sequence: " + longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        int length = nums.length;
        if(length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int currentLen = 0;
        int maxLen = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int checkEle = num;
                while(set.contains(checkEle)){
                    currentLen++;
                    checkEle++;
                }
            }
            if(currentLen > maxLen){
                maxLen = currentLen;
            }
            currentLen = 0;
        }
        return maxLen;
    }

//    public static int longestConsecutive(int[] nums) {
//        return 0;
//    }
}
