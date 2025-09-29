import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = {20,10,40,15,5};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i]; // element to be inserted
            int j = i - 1;
            // j = 1, i = 2;
            // shift elements to the right until the right spot for key is found
            while(j >= 0){
                if(key < nums[j]){
                    nums[j+1] = nums[j];
                }else{
                    break;
                }
                j--;
            }
            nums[j + 1] = key;
        }
    }
}
