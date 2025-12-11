/**
 * Problem number 704
 * @author jeremiahhodges
 * @version 12/9/2025
 */

public class BinarySearch {

    public static void main(String[] args) {
    int[] nums = new int[]{7,8,4,5,3,9,10,32,16,88,67,1,0,2};
    int target = 67;
    System.out.println(binarySearch(nums, target));
        System.out.println("target is " + target + " and we found " + nums[binarySearch(nums,target)] + " at index " + binarySearch(nums,target) );
    }
    public static int binarySearch(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
        }
        return -1;
    }
}
