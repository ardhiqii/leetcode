class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int val = 0;
        for(int i = 0; i < nums.length; i++){
            int min = nums[i];
            int temp = Math.abs(min-min);
            int j = i;
            while(temp <= k && j < nums.length){
                temp = Math.abs(nums[j] - min);
                if(temp <= k) j++;
            }
            System.out.println(i);
            System.out.println(j);
            i = j-1;
            val++;
        }
        return val;
    }
}