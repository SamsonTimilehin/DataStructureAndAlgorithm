package cyclic;

import java.util.Arrays;

public class SetMisMatch {

    public static void main(String[] args) {
       int[] arrItem = {1,2,2,4};
        System.out.println(Arrays.toString(findDuplicateAndMisMatchNumbers(arrItem)));

    }

    public static int[] findDuplicateAndMisMatchNumbers(int[] arr){

        int indexPosition = 0;
        while (indexPosition < arr.length){

            int correctIndex = arr[indexPosition] - 1;
            if(arr[indexPosition] != arr[correctIndex]){
                swap(arr, indexPosition, correctIndex);
            }else {
                indexPosition++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){
                return new int[]{arr[i], i + 1};
            }
        }
        return new int[]{-1,-1};
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
