public class ElementPositionSearch2 {

    public static void main(String[] args) {
        int[]descendingOrderSortedArray = {34,32,12,10,7,5,4};
        int search = 4;
        System.out.println(findElementPosition(descendingOrderSortedArray, search));
    }
    public static int findElementPosition(int[]arr, int target){

        int startPosition= 0;
        int endPosition = arr.length - 1;

        while(startPosition <= endPosition){

            int mid = startPosition + (endPosition - startPosition) / 2;

            if(target < arr[mid]){
                startPosition = mid + 1;
            }else if(target > arr[mid]){
                endPosition = mid - 1;
            }else{
                return mid;
            }
        }return -1;

    }
}
