public class maxSubarraySum {

    public static int maxSubArraySum(int nums[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;

                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                System.out.println(currentSum);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        System.out.println("Maximum contiguous sum is: " + maxSubArraySum(arr));
    }

}
