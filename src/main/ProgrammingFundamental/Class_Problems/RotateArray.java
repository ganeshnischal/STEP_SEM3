package main.ProgrammingFundamental.Class_Problems;

class RotateArray {
    int[] rotateArray(int[] nums, int k) {
        k = k % nums.length;
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int newPosition = (i + k) % nums.length;
            newArray[newPosition] = nums[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        RotateArray obj = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] result = obj.rotateArray(nums, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
