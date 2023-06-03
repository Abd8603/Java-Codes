/*Divide And Rule Algorithm
array = [1,2,3,4,5,6,7]
Divide into two parts    [1,2,3,4][5,6,7]
Rotate Sub Part     [4,3,2,1][7,6,5]
Now Rotate Whole array  [7,6,5,4,3,2,1]
*/
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % (nums.length);
        swap(nums,0,nums.length-1-k);
        swap(nums,nums.length-k,nums.length -1);
        swap(nums,0,nums.length-1);
    }
    public void swap(int[] nums, int left, int right){
        if(nums == null || nums.length == 1)
            return;
        
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    
}