class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        huh(res,new ArrayList<>(), nums);
        return res;
    }
    void huh(List<List<Integer>>res, ArrayList<Integer> temp, int[] nums ){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
        }
        for(int i = 0; i < nums.length; i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            huh(res,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}