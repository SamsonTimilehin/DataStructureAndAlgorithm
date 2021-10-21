public class ElementPositionSearch {

    public static void main(String[] args) {
  int[]ascendingSortedArray = {2,4,6,12,17,25,67};
  int target = 17;
        System.out.println(binarySearchForPosition(ascendingSortedArray,target));
    }
    public static int binarySearchForPosition(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start)/ 2;


            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }

        }
        return -1;
    }
}
