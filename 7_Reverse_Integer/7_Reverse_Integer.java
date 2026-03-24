import java.lang.Math;
class Solution {
    public int reverse(int x) {
        int num , rev, sum=0;
        if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE) {
            return (0);
        }
        for(int i=0; (x>0||x<0); i++)
        {
            num = x%10;
            if(sum>Integer.MAX_VALUE/10 || sum <Integer.MIN_VALUE/10)
                return(0);
            sum=sum*10+num;
            x=x/10;
            System.out.println(sum);
        }
        return (sum);
    }
}
