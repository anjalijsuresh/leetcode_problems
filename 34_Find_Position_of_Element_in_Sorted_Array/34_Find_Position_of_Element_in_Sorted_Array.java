class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1,last=-1;
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(first==-1)
                    first=i;
                last=i;
            }
        }
        result[0]=first;
        result[1]=last;
        return (result);
    }
}
