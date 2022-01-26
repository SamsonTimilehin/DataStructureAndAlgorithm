package recursion;

public class SearchingWithRecursion {

    public static void main(String[] args) {
        int[] arr = {4,7,9,11,23,54,89,102};
        int searchItem = 89;

        System.out.println(findNumberIndex(arr,searchItem,0, arr.length - 1));
    }

    public static int findNumberIndex(int[] items, int target, int startIndex, int endIndex){

        if(startIndex > endIndex){
            return  - 1;
        }

        int middleIndex = startIndex + (endIndex - startIndex)/2;

        if(items[middleIndex] == target){
            return middleIndex;
        }
        if(items[middleIndex] > target){
          return findNumberIndex(items,target,startIndex,middleIndex - 1);
        }
            return findNumberIndex(items,target,startIndex + 1, endIndex);
    }
}
