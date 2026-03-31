class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0,k=0;
        int[] expectedNums = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                expectedNums[k]=nums[i];
                k++;
            }
            if(nums[i]==val){
                j++;
            }
        }
        System.arraycopy(expectedNums, 0, nums, 0, expectedNums.length-j);
        return (expectedNums.length-j);
    }
}
