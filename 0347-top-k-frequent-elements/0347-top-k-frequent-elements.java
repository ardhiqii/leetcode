class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i < nums.length;i++){
            int val = hm.getOrDefault(nums[i],0)+1;
            hm.put(nums[i],val);
        }
        int[] ans = new int[k];
        int i = 0;

        for(Map.Entry<Integer,Integer> m : hm.entrySet()){
            pq.add(m.getValue());
            if(pq.size() > k) pq.poll();
        }
        for(Map.Entry<Integer,Integer> m : hm.entrySet()){
            if(pq.contains(m.getValue())){
                ans[i] = m.getKey();
                i++;
            }
        }

        return ans;
    }
}