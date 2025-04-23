class Solution {
    public int countLargestGroup(int n) {
        if(n == 1){
            return 1;
        }
        int result = 0;
        int largest = 0;
        int totalDigit = 0;
        
        boolean calculate = true;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 1; i<=n; i++){
            if(calculate){
                int num = i / 10;
                totalDigit = 0;
                while(num > 0){
                    totalDigit += num%10;
                    num /= 10;
                }
                calculate = false;
            }

            int sum = totalDigit + i%10;
            if(sum != 0){
                map.put(sum,map.getOrDefault(sum,0)+1);
                int currFreq = map.get(sum);
                if(currFreq > largest){
                    largest = currFreq;
                    result = 0;
                }
                if(currFreq == largest){
                    result++;
                }
            }
            if(i%10 == 9) calculate = true;
            // System.out.println(sum);
        }

    
        
        return result;
    }
}