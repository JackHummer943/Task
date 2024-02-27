package algorithms;

import java.util.Arrays;
public class MinMaxSort {
    public static void main(String[] args) {
        int[] mas = {2,3,1,5,0,-1,10,7,5};

        int start, end, step, valMin, valMax, min_index, max_index, temp;
        for (start = 0, end = mas.length - 1; start < end; start++, end--) {
            valMin = valMax = mas[start];
            min_index = max_index = start;
            for (step = start; step<=end; step++) {
                if (mas[step] > valMax) {
                    valMax = mas[step];
                    max_index = step;
                } else if (mas[step] < valMin) {
                    valMin = mas[step];
                    min_index = step;
                }
            }
            temp = mas[start];
            mas[start] = mas[min_index];
            mas[min_index] = temp;
            if(mas[min_index] == valMax) {
                temp = mas[end];
                mas[end] = mas[min_index];
                mas[min_index] = temp;
            } else {
                temp = mas[end];
                mas[end] = mas[max_index];
                mas[max_index] = temp;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}