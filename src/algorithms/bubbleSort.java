package algorithms;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,0,5,3,7,8,10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - 1); j++ ) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1] - (arr[j + 1] = arr[j]);
                }
            }
        }
    }
}

