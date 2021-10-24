import java.util.Arrays;

public class PositionSearch {

    public static void main(String[] args) {

        int[] arr = {2,4,4,5,5,7,9,11,17,50};
        int tar = 17;
        System.out.println(Arrays.toString(searchRange(arr, tar)));
    }
    public static int[] searchRange(int[]nums, int target){

        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        if(ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }
    public static int search(int[] nums, int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
