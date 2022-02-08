package cyclic;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[]arrItem = {5,2,4,1,3};
        sort(arrItem);
        System.out.println(Arrays.toString(arrItem));

    }

    public static void sort(int[]arr){

        int i = 0;

        while (i < arr.length){

            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex) {

        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
