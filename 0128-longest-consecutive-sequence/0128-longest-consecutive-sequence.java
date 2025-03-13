class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <=1)return nums.length;
        Arrays.sort(nums);
        int longest = 1;
        int temp = 1;
        int before = nums[0];
        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];
            if(before == curr) continue;
            if(before+1 == curr){
                // System.out.printf("%d %d |",before,curr);
                temp++;
            }else{
                // System.out.printf("temp = %d \n",temp);
                longest = Math.max(temp,longest);
                temp = 1;
            }
            before = nums[i];
        }
        longest = Math.max(temp,longest);
        // System.out.println(Arrays.toString(nums));
        return longest;   
    }
}