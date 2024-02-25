package algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] mas = {2,1,4,3,6,5};
        bubbleSort(mas);
        System.out.println(Arrays.toString(mas));
    }
    public static void bubbleSort(int mas[]) {
        for (int i = 0; i < (mas.length - 1); i++) {
            for (int j = 0; j < (mas.length - 1) - i; j++) {
                if (mas[j] > mas[j + 1]) {
                    mas[j] = mas[j] * mas[j + 1];
                    mas[j + 1] = mas[j] / mas[j + 1];
                    mas[j] = mas[j] / mas[j + 1];
                }
            }
        }
    }
}

