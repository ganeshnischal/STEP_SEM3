package main.ProgrammingFundamental.Assignment_Problems;
class SubarraySum {
    int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        SubarraySum obj = new SubarraySum();
        int[] nums = {1, 1, 1};
        int k = 2;
        int result = obj.subarraySum(nums, k);
        System.out.println("Number of subarrays: " + result);
    }
}
