class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        if(arr.size() >= rowIndex+1 ){
            return arr.get(rowIndex);
        }
        for(int i = 0;i<=rowIndex;i++){
            if(i==0){
                ArrayList<Integer> nv = new ArrayList<>();
                nv.add(1);
                arr.add(nv);
            }
            if(i==1){
                ArrayList<Integer> nv = new ArrayList<>();
                nv.add(1);
                nv.add(1);
                arr.add(nv);
            }
            if(i > 1){
                ArrayList<Integer> nv = new ArrayList<>();
                nv.add(1);
                ArrayList<Integer> lastArr = arr.get(i-1);
                for(int j = 0; j <lastArr.size()-1;j++){
                    nv.add(lastArr.get(j) + lastArr.get(j+1));
                }
                nv.add(1);
                arr.add(nv);

            }
        }
        
        return arr.get(rowIndex);
    }
}