package cyclic;


public class MissingNumber {



    public static void main(String[] args) {
       int[]arrItem = {5,2,0,1,4};
        System.out.println(findMissingNumber(arrItem));
    }
    public static int findMissingNumber(int[]arr){

        int index = 0;

        while(index < arr.length){
            int correctIndex = arr[index];
            if(arr[index] < arr.length && arr[index] != arr[correctIndex]){
                swap(arr, index,correctIndex);
            }else{
                index++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i){
                return i;
            }
        }
        return -1;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp;
        temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
