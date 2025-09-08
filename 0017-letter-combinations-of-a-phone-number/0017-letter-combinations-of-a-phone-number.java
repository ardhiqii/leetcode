class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return res;

        HashMap<Character, String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");

        bete(0, 0, digits, hm, new StringBuilder(), res);
        return res;
    }

    private void bete(int idx, int idx_let, String digits,
                      HashMap<Character, String> hm,
                      StringBuilder curr, List<String> res) {

        if (curr.length() == digits.length()) {
            res.add(curr.toString());
            return;
        }
        if (idx >= digits.length()) {
            return;
        }

        String letter = hm.get(digits.charAt(idx));
        if (idx_let >= letter.length()) {
            return;
        }

        // choose this letter
        curr.append(letter.charAt(idx_let));
        bete(idx + 1, 0, digits, hm, curr, res);
        curr.deleteCharAt(curr.length() - 1); // backtrack

        // try next letter of this digit
        bete(idx, idx_let + 1, digits, hm, curr, res);
    }
}
