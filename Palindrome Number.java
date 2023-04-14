class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int z = 0;
        while(y > 0){
            z *= 10;
            z += (y%10);
            y /= 10;
        }
        if(x == z) return true;
        
        return false;
    }
}