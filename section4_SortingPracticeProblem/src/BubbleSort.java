import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {20,10,40,15,5};
        BubbleSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    // l1: [2,5,4,1]
    // l2: [2,4,5,1]
    // l3: [2,4,1,5]

    // l1: [2,4,1,5]
    // l2: [2,1,4,5]
    // l3: [2,1,4,5]

    // l1: [1,2,4,5]
    // l2: [1,2,4,5]
    // l3: [1,2,4,5]

    private static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for(int j = 0; j < length - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
