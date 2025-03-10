class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();
        int[] result = new int[k];
        PriorityQueue<HashMap.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            if(count.containsKey(curr)){
                int value = count.get(curr) + 1;
                count.put(curr,value);
            }else{
                count.put(curr,1);
            }
        }
        for(Map.Entry c: count.entrySet()){
            pq.add(c);            
        }
        for(int i = 0; i < k; i++){
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}