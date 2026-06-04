class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            int j = i+1;
            
            while(j < nums.length && nums[i] == nums[j]){
                j++;
            }
            k++;
            if(k < nums.length && j< nums.length){
                // System.out.printf("%d | %d\n", nums[j],j);
                nums[k]=nums[j];
            }
            i=j-1;

            
        }
        System.out.println(k);
        return k;
    }
}