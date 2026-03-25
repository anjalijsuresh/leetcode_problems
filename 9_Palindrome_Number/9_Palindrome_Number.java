bool isPalindrome(int x) {
    int q,s=0,e;
    e=x;
    
    if(x<0)
    {
        return false;
        exit(0);
    }
    else
    {
        while(x>0)
        {
            q=x%10;
            s=s*10+q;
            x=x/10;
        }
        if(e==s)
        {
             return true;
        }
        else
        {
             return false;
         }
    }
    
    
}
