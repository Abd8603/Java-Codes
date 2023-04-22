class Solution {
    public int findNumbers(int[] nums) {
        int cout = 0;
        for(int number : nums){
            if(counting(number)%2 == 0) cout++;
        }
        return cout;
    }
    public int counting(int number){
        int count = 0;
        while(number > 0){
            count ++;
            number /= 10;
        }
        return count;
    }
}