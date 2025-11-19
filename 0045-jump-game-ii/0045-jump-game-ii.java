class Solution {
    int min = Integer.MAX_VALUE;
    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        HashMap<Integer,Integer> memo = new HashMap<>();
        dp(nums,memo,nums.length-2);
        // for(Map.Entry m : memo.entrySet()){    
        //     System.out.println(m.getKey()+" "+m.getValue());    
        // }  
        return memo.get(0);

    }
    private void dp(int[] nums, HashMap<Integer,Integer> memo, int idx){
        if(idx < 0){
            return;
        }
        int val = nums[idx];
        if(val+idx >= nums.length-1){
            memo.put(idx,1);
        }else{
            int currMin = nums.length-idx-1;
            for(int i = 1; i <= val;i++){
                int curr = memo.get(idx+i);
                currMin = Math.min(currMin,curr+1);
            }
            memo.put(idx,currMin); 
        }
        dp(nums,memo,idx-1);
        
    }
}