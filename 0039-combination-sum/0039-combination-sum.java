class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> value = new ArrayList<>();
        int currSum = 0;
        dfs(0,candidates,target,res,value,currSum);
        return res;
    }

    private void dfs(int i, int[] candidates, int target, List<List<Integer>> res,      List<Integer> value, int currSum ){
        if(currSum == target ){
            res.add(new ArrayList<>(value));
            return;
        }
        if(i >= candidates.length || currSum > target){
            return;
        }

        currSum += candidates[i];
        value.add(candidates[i]);
        dfs(i,candidates,target,res,value,currSum);

        currSum -= candidates[i];
        value.remove(value.size() - 1);
        dfs(i+1,candidates,target,res,value,currSum);

    }
}