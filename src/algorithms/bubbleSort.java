package algorithms;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int [] mas = {1,3,7,2,8,5,0,9};
        bubbleSort(mas);
System.out.println(Arrays.toString(mas));

    }
    public static void bubbleSort(int mas[]) {

        for( int i = 0; i < mas.length; i ++) {
            for (int j = 0; j < (mas.length - 1); j++) {
                if (mas[j] > mas[j + 1]) {
                    mas[j] = mas[j] + mas[j + 1];
                    mas[j + 1] = mas[j] - mas [j + 1];
                    mas[j] = mas[j] - mas[j+1];
                }
            }
        }
    }
}
