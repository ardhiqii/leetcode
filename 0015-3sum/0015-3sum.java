class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int len = nums.length - 1;
        for(int i =0;i <= len-2;i++){
            int target = -nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i+1;
            int r = len;
            while(l < r){
                int sum = nums[l] + nums[r];
                if(sum > target){
                    r = r-1;
                }else if(sum < target){
                    l = l +1;
                }else if(sum == target){
                    List<Integer> value = new ArrayList<>();
                    value.add(nums[i]);
                    value.add(nums[l]);
                    value.add(nums[r]);
                    result.add(value);
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }

                    // Skip duplicate elements for k
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    l++; 
                    r--;
                  
                }
            }
        }
        return result;
    }
}