class Solution {
    public int romanToInt(String s) {
        int sum=0;
        String s1="",s2="";
        for(int i=0; i<s.length();i++)
        {
            s1=s.substring(i,i+1);
            if((i+1) !=s.length())
                s2=s.substring(i+1,i+2);         
            if(s1.equals("M"))
                sum=sum+1000;
            else if(s1.equals("D"))
                sum=sum+500;
            else if(s1.equals("C")){
                if((i+1)!=s.length() && s2.equals("D")){
                    sum=sum+400;
                    i=i+1;
                }
                else if((i+1) !=s.length() && s2.equals("M")){
                    sum=sum+900;
                    i=i+1;
                }
                else{
                    sum=sum+100;
                }
            }
            else if(s1.equals("L"))
                sum=sum+50;
            else if(s1.equals("X")){
                if((i+1) !=s.length() && s2.equals("L")){
                    sum=sum+40;
                    i=i+1;
                }
                else if((i+1) !=s.length() && s2.equals("C")){
                    sum=sum+90;
                    i=i+1;
                }
                else{
                    sum=sum+10;
                }
            }
            else if(s1.equals("V"))
                sum=sum+5;
            else if(s1.equals("I")){
                if((i+1) !=s.length() && s2.equals("V")){
                    sum=sum+4;
                    i=i+1;
                }
                else if((i+1) !=s.length() && s2.equals("X")){
                    sum=sum+9;
                    i=i+1;
                }
                else{
                    sum=sum+1;
                }
            }
        }
        return (sum);
    }
}
