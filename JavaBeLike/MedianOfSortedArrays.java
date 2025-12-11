/**
 * Problem number 4
 */
public class MedianOfSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int first = 0;
        int second = 0;
        int[] nums = new int[m + n];
        while (first < m && second  < n) {
           if (nums1[first] < nums2[second]) {
               nums[first+second] = nums1[first++];
           } else if (nums1[first] >= nums2[second]) {
               nums[second+first] = nums2[second++];
           }
        }
        if (first == m) {
            for (int i = second; i < nums2.length; i++) {
                nums[first+i] = nums2[i];
            }
        } else {
            for (int i = first; i < nums1.length; i++) {
                nums[second+i] = nums1[i];
            }
        }
        for (int num : nums){
            System.out.println(num);
        }
        if (nums.length % 2 == 0){
            return (double) (nums[(nums.length / 2) - 1] + nums[(nums.length / 2) - 1]) /2;
        } else {
            return nums[(nums.length / 2) - 1];
        }
    }
    public static void main(String[] args) {
        MedianOfSortedArrays m = new MedianOfSortedArrays();
        int[] nums1 = new int[]{1,3,3,5,6,8,9};
        int[] nums2 = new int[]{2,3,4,7,10};
        m.findMedianSortedArrays(nums1,nums2);
    }
}
