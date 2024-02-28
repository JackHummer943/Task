package algorithms;

import java.util.Arrays;
public class MinMaxSort {
    public static void main(String[] args) {
        int arr[] = {9,9,3,2,1,4,0,-1,11,99,5};
        MinMaxSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void MinMaxSort (int[] arr){
        int start, end, step, maxVal, minVal, min_index, max_index, timeVal;
        for (start=0, end = (arr.length-1); start < end; start++, end--) {
             minVal = maxVal = arr[start];
             min_index = max_index = start;
for (step = start; step <= end; step++) {

    if (arr[step] > maxVal) {
        maxVal = arr[step];
        max_index = step;
    } else if ( minVal > arr[step] ) {
        minVal = arr[step];
        min_index = step;
    }
        }
        timeVal = arr[start];
        arr[start] = arr[min_index];
        arr[min_index] = timeVal;
        if(arr[min_index] == maxVal) {
            timeVal = arr[end];
            arr[end] = arr[min_index];
            arr[min_index] = timeVal;
        }
        else {
            timeVal = arr[end];
            arr[end] = arr[max_index];
            arr[max_index] = timeVal;
        }
    }
}}