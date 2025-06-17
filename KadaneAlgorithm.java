public class KadaneAlgorithm {
    public static int maxSubArraySum(int[] nums) {
       int maxSoFar = nums[0];   
       int maxEndingHere = nums[0]; 
       for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
       }
       return maxSoFar;
    }
    public static void main(String[] args) {
        int[] arr = {-4, 1, -5, 4, -1, 2, 6, -3, 4};
        int maxSum = maxSubArraySum(arr);
        System.out.println("Maximum contiguous sum is " + maxSum);
    }
}
