class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        while(i < numbers.length){
            int j = i +1;
            while(j < numbers.length){
            if(numbers[i] + numbers[j] == target) return new int[]{i,j};
            else j++;
            }
            i++;
        }
        return new int[]{i,0};
    }
}