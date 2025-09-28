import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        [2, 4, -2, 4, 5]
        List<Integer> nums = Arrays.asList(-1,1,0,-3,3);
        int[] arr = nums.stream()
                .mapToInt(x -> x) // chuyển Integer → int
                .toArray();
//        System.out.println(MaxSumSubArrUtil.maxSubArray(arr));
//        System.out.println(BestTimeToBuySellArrUtil.maxProfitSuitable(arr));
//        System.out.println(MaxProductSubArrUtil.maxProduct(arr));
        System.out.println(Arrays.toString(ProductOfArrayExceptSelf.productExceptSelf(arr)));
    }
}