public class Solution {
    public List<String> generateParenthesis(int n) {   
        List<String> result = new ArrayList<>();
        List<String> result2 = new ArrayList<>();

        rekursif("", n, n, result);

        // System.out.println(result);
        return result;
    }

    private void rekursif(String curr, int l, int r, List<String> result) {
        if (l == 0 && r == 0) {
            result.add(curr);
            return;
        }
        if (l <= r && l > 0) {
            String newcurr = curr + "(";
            rekursif(newcurr, l - 1, r, result);
        }
        if (r > l) {
            String newcurr = curr + ")";
            rekursif(newcurr, l, r - 1, result);
        }
        
    }
}