import java.util.Arrays;

public class MinMaxSort {
    public static void main(String[] args) {
        int [] arr = {4,8,0,1,2,5,7};
        MinMaxSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void MinMaxSort(int[] arr){
        int start, end, step, min, max, min_index, max_index, temp;
        for (start = 0, end = arr.length - 1; start < end; start++, end--) {
            min = max = arr[start];
            min_index = max_index = start;
            for (step=start; step <= end; step++) {
                if (arr[step] > max) {
                    max = arr[step];
                    max_index = step;
                }
                else if (arr[step] < min){
                    min = arr[step];
                    min_index = step;
                }
            }
            temp = arr[start];
            arr[start] = arr[min_index];
            arr[min_index] = temp;
            if (arr[min_index] == max) {
                temp = arr[end];
                arr[end] = arr[min_index];
                arr[min_index] = temp;
            }
            else {
                temp = arr[end];
                arr[end] = arr[max_index];
                arr[max_index] = temp;
            }
        }
    }

}