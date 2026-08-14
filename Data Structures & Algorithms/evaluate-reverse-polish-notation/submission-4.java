class Solution {
    public int evalRPN(String[] token) {
        Stack<Integer> stak = new Stack<>();
        for(String t: token){
            if(t.length() ==1 && "+-*/".indexOf(t.charAt(0)) >= 0){
                int x = stak.pop();
                int y = stak.pop();
                switch(t.charAt(0)){
                    case '+': stak.push(x+y);
                        break;
                    case '-': stak.push(y-x);
                        break;
                    case '*': stak.push(x*y);
                        break;
                    case '/': stak.push(y/x);
                        break;
                }
            }else{
                stak.push(Integer.parseInt(t));
            }
        }
        return stak.pop();
    }
}