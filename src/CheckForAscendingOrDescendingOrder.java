public class CheckForAscendingOrDescendingOrder {

    public static void main(String[] args) {
  int[]arr = {67,34,22,20,16,12,8};
  int target = 8;
        System.out.println(searchElementPosition(arr,target));

    }
    public static int searchElementPosition(int[]arr, int target){

        int start = 0;
        int end = arr.length - 1;

        boolean isAscendingOrder = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }
            if(isAscendingOrder){
                if(target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    return mid;
                }
            }else {
                if(target < arr[mid]){
                    start = mid + 1;
                }else if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
