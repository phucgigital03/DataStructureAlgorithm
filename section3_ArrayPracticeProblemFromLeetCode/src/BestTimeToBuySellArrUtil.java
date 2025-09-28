public class BestTimeToBuySellArrUtil {
    public static int maxProfitSuitable(int[] nums) {
        int minSoFar = nums[0];
        int maxProfit = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] < minSoFar){
                minSoFar = nums[i];
                continue;
            }
            if(nums[i] - minSoFar > maxProfit){
                maxProfit = nums[i] - minSoFar;
            }
        }

        return maxProfit;
    }
}
