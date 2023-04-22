class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int sum = 0;
        for(int number : nums){
            if(number == 0) sum = 0;
            else    sum++;
            if(result < sum)    result = sum;
        }
        return result;
        
    }
}