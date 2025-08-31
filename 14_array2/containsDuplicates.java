

public class containsDuplicates {

    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 1};
        if (containsDuplicate(nums)) {
            System.out.println("Array contains duplicates.");
        } else {
            System.out.println("Array does not contain duplicates.");
        }
    }
}
