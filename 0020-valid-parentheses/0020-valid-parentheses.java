class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        HashMap <Character,Character> hm = new HashMap<>();
        hm.put(']','[');
        hm.put(')','(');
        hm.put('}','{');

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(stack.empty()){
                stack.push(curr);
                continue;
            }
            if(!hm.containsKey(curr)){
                stack.push(curr);
            }else{
                char peek = stack.peek();
                char partner = hm.get(curr);
                if(peek == partner){
                    stack.pop();
                }else{
                    stack.push(curr);
                }
            }
        }
        return stack.empty();
    }
}