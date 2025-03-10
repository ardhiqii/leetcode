class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(int key: hm.keySet()){
            int freq = hm.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] result = new int[k];
        int idx = 0;
        for(int i = bucket.length - 1; i>=0; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    result[idx++] = num;
                    if(idx == k) return result;
                }   
            }
            
        }
        return result;
    }
}