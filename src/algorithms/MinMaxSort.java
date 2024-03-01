package algorithms;

import java.util.Arrays;

public class MinMaxSort {
    public static void main(String[] args) {
        int []mas = {2,9,3,7,4,0,-1,1};
        MinMax(mas);
        System.out.println(Arrays.toString(mas));
    }
    public static void MinMax(int[] mas) {
        int start, end, step, maxVal, minVal, minIndex, maxIndex, timeVal;
        for (start = 0, end = mas.length - 1; end > start; start++, end--) {
            maxVal = minVal = mas[start];
            minIndex = maxIndex = start;
            for (step = start; step<=end; step++) {
                if (mas[step] > maxVal) {
                    maxVal = mas[step];
                    maxIndex = step;
                } else if (mas[step] < minVal) {
                    minVal = mas[step];
                    minIndex = step;
                }
            }
            timeVal = mas[start];
            mas[start] = mas[minIndex];
            mas[minIndex] = timeVal;
            if(mas[minIndex] == maxVal) {
                timeVal = mas[end];
                mas[end] = mas[minIndex];
                mas[minIndex] = timeVal;
            }
            else {
                timeVal = mas[end];
                mas[end] = mas[maxIndex];
                mas[maxIndex] = timeVal;
            }
        }
    }
}