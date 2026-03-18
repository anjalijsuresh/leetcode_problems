class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m,n,i=0,j=0,k=0;
        m=nums1.length;
        n=nums2.length;
        double result;
        int[] res=new int[m+n];
        while(j<m || k<n){
            while(j<m && k<n){
                if(nums1[j]<=nums2[k]){
                    res[i]=nums1[j];
                    j++;
                    i++;
                }
                else if(nums1[j]>nums2[k]){
                    res[i]=nums2[k];
                    k++;
                    i++;
                }
            }
            if(j<m ){
                res[i]=nums1[j];
                j++;
                i++;
            }
            if(k<n){
                res[i]=nums2[k];
                k++;
                i++;
            }
        }        
        if((m+n)%2==0)
            result=((Double.valueOf(res[(m+n)/2-1])+Double.valueOf(res[(m+n)/2]))/2);
        else
            result=(res[((m+n)/2)]);
        return(result);
    }
}
