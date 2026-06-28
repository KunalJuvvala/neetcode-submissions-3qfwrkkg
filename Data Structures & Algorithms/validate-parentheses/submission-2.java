class Solution {
    public boolean isValid(String s) {
        Stack <Character> stak = new Stack<>();
        int len = s.length();
        for(int i = 0; i<len; i++){
            char x = s.charAt(i);
            if(x=='(' || x=='[' || x=='{'){
                stak.push(x);
            }else if(x=='}'){
                if(stak.isEmpty() || stak.peek() != '{'){
                    return false;
                }else{
                    stak.pop();
                }
            }else if(x==']'){
                if(stak.isEmpty() || stak.peek() != '['){
                    return false;
                }else{
                    stak.pop();
                }
            }else if(x==')'){
                if(stak.isEmpty() || stak.peek() != '('){
                    return false;
                }else{
                    stak.pop();
                }
            }else{
                return false;
            }
        }
        return stak.isEmpty();
    }
}