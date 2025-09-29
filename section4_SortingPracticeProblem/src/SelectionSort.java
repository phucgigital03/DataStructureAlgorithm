import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {20, 10, 40, 15, 5};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] arr) {
        //choose the smallest element and then put it the correct place
        int init = 0;
        int length = arr.length;
        // [2,3,4,1]
        // [1,3,4,2]
        // [1,2,4,3]
        // [1,2,3,4]

        // [3,2,4,1]
        // [1,2,4,3]
        for(int i = 0; i < length; i++){
            int min = arr[i];
            int temp = arr[i];
            for(int j = i; j < length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    init = j;
                }
            }

            if(temp != min){
                arr[i] = min;
                arr[init] = temp;
            }
        }
    }
}
