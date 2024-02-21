package algorithms;
import java.util.Arrays;

public class MinMaxSort {
    public static void main(String[] args) {
        int [] arr = {5, 3, 2, 1, 7};
        System.out.println("Неотсортированный массив: " + Arrays.toString(arr) );
        minmax(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }

   public static void minmax (int[] arr)     {
       int i, j, k, min, max, min_indx, max_indx, tmp;
       for (i=0, j=arr.length-1; i<j; i++, j--)
       {

           min=max=arr[i];

           min_indx = max_indx = i;

           for (k=i;k<=j;k++)
           {
               if (arr[k] > max) {
                   max = arr[k];
                   max_indx = k;
               } else if (arr[k] < min) {
                   min = arr[k];
                   min_indx = k;
               }
           }
           tmp = arr[i];
           arr[i] = arr[min_indx];
           arr[min_indx] = tmp;
           if(arr[min_indx] == max){
               tmp = arr[j];
               arr[j] = arr[min_indx];
               arr[min_indx]=tmp;
           }
           else {
               tmp=arr[j];
               arr[j]=arr[max_indx];
               arr[max_indx] = tmp;
           }
       }
   }
}
