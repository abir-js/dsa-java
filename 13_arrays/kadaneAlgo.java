public class kadaneAlgo {

    public static void kadanes(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i< nums.length; i++){
            currSum = currSum + nums[i];

            if(currSum < 0) currSum = 0;

            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Maximum Subarray sum is: "+ maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(arr);
    }
}
