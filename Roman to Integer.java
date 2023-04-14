class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int i = 0;
        int sum = 0;
        char ch,ch2;
        while(i<len){
            ch = s.charAt(i);
            if(ch == 'M'){
                sum += 1000;
            }
            else if(ch == 'D'){
                sum += 500;
            }
            else if(ch == 'C'){
                if(i<len-1){
                    ch2 = s.charAt(i+1);
                    if(ch2 == 'D'){
                        sum+=400;
                        i++;
                    }
                    else if(ch2 == 'M'){
                        sum+=900;
                        i++;
                    }
                    else{
                        sum+=100;
                    }
                }
                else{
                    sum+=100;
                }
            }
            else if(ch == 'L'){
                sum += 50;
            }
            else if(ch == 'X'){
                if(i<len-1){
                    ch2 = s.charAt(i+1);
                    if(ch2 == 'L'){
                        sum+=40;
                        i++;
                    }
                    else if(ch2 == 'C'){
                        sum+=90;
                        i++;
                    }
                    else{
                        sum+=10;
                    }
                }
                else{
                    sum+=10;
                }
            }
            else if(ch == 'V'){
                sum += 5;
            }
            else if(ch == 'I'){
                if(i<len-1){
                    ch2 = s.charAt(i+1);
                    if(ch2 == 'V'){
                        sum+=4;
                        i++;
                    }
                    else if(ch2 == 'X'){
                        sum+=9;
                        i++;
                    }
                    else {
                        sum+=1;
                    }               
                }
                else{
                    sum+=1;
                }
            }
            else{
                System.out.println("Wrong Character");
            }
            i++;
        }
        return sum;
    }
}