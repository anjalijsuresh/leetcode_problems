class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        boolean success=true;
        if(strs.length==0)
            return("");
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].length()==0)
                return ("");
            prefix=strs[0].substring(0,i+1);
            for(int j=0;j<strs.length;j++){
                if(!(strs[j].startsWith(prefix))){
                    if(i!=0) {
                       prefix=strs[0].substring(0,i);
                       success=false;
                    }
                    else {
                        prefix="";
                        success=false;
                    }
                    break;
                }
            }
            if(!success)
                break;
            //if(prefix.length()==0)
                //break;
        }
        return (prefix);
    }
}
