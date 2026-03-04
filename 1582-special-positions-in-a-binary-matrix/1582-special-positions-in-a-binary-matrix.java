class Solution {
    public int numSpecial(int[][] mat) {
        HashMap <Integer,Integer> row = new HashMap<>();   
        HashMap <Integer,Integer> col = new HashMap<>();
        ArrayList<ArrayList<Integer>> one = new ArrayList<>();   
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    row.put(i,row.getOrDefault(i,0)+1);
                    col.put(j,col.getOrDefault(j,0)+1);
                    one.add(new ArrayList<>(Arrays.asList(i, j)));
                }
            }
        }
        int res = 0;
        for(ArrayList<Integer> coor: one){
            if(row.get(coor.get(0)) == 1 && col.get(coor.get(1)) == 1){
                res++;
            }
        }
        return res;
    }
}