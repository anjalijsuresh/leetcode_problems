class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean includes=false;
        int result=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==result)
                result++;
            if(nums[i]>result)
                return(result);
        }
        return(result);
    }
}
