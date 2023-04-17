class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> vap = new ArrayList<String>();
        String x;
        for(int i = 1; i <= n;i++){
            if(i % 3 == 0 ){
                if(i%5 == 0){
                    x = "FizzBuzz";
                }
                else {
                    x = "Fizz";
                }
            }
            else if(i%5 == 0){
                x = "Buzz";
            }
            else{
                x = Integer.toString(i);
            }
            vap.add(x);
        }
        return vap;
    }
}