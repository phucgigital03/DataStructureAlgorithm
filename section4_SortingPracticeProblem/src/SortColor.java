import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
//  0,0,2,1,1,2
//

    private static void sort(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int i = 0;

        while (i <= r) {
            if(arr[i] == 0){
                swap(arr,i,l);
                l++;
                i++;
            }else if(arr[i] == 2){
                swap(arr,i,r);
                r--;
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
