import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {2,0,6,3,5,7,4};
        QuickSort.sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] arr, int low, int high) {
        if(low < high){
            int piPos = partition(arr, low, high);
            sort(arr,low, piPos - 1);
            sort(arr, piPos + 1, high);
        }
        return;
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for(int j = low; j < high; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
