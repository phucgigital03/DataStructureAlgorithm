import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 4, 0, 3, 12};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
        }
    }
}
