class Solution {
    public String intToRoman(int num) {
        String result="";
        while(num>0){
            if(num/1000>0){
                result=result.concat("M");
                num=num-1000;
            }
            else if(num/900>0){
                result=result.concat("CM");
                num=num-900;
            }  
            else if(num/500>0){
                result=result.concat("D");
                num=num-500;
            }
            else if(num/400>0){
                result=result.concat("CD");
                num=num-400;
            }   
            else if(num/100>0){
                result=result.concat("C");
                num=num-100;
            } 
            else if(num/90>0){
                result=result.concat("XC");
                num=num-90;
            }
            else if(num/50>0){
                result=result.concat("L");
                num=num-50;
            } 
            else if(num/40>0){
                result=result.concat("XL");
                num=num-40;
            }
            else if(num/10>0){
                result=result.concat("X");
                num=num-10;
            }
            else if(num/9>0){
                result=result.concat("IX");
                num=num-9;
            }
            else if(num/5>0){
                result=result.concat("V");
                num=num-5;
            }
            else if(num/4>0){
                result=result.concat("IV");
                num=num-4;
            }
            else {
                result=result.concat("I");
                num=num-1;
            }
        }
        return (result);
    }
}
