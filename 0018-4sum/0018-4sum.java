class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        int len = nums.length - 1;
        for(int i =0;i <= len-3;i++){
            for(int j = i+1; j <= len-2;j++){
                int l = j+1;
                int r = len;
                while(l < r){
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    // if(sum <= Integer.MIN_VALUE || sum >= Integer.MAX_VALUE){
                    //     l++;
                    //     r--;
                    //     continue;
                    // }
                    if(sum > target){
                        r = r-1;
                    }else if (sum < target){
                        l = l +1;
                    }else if (sum == target){
                        List<Integer> value = new ArrayList<>();
                        value.add(nums[i]);
                        value.add(nums[j]);
                        value.add(nums[l]);
                        value.add(nums[r]);
                        if(!res.contains(value)){
                            res.add(value);
                        }
                        l++;
                        r--;
                    }
                
                }
            }
        }    
        return res;
    }
}