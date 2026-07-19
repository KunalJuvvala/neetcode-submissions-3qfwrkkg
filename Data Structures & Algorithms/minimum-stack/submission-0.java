class MinStack {
    List<Integer> stak;
    List<Integer> prefix;

    public MinStack() {
        stak = new ArrayList<>();
        prefix = new ArrayList<>();
    }
    
    public void push(int val) {
        stak.add(val);
        if(!prefix.isEmpty()){
            prefix.add(Math.min(prefix.get(prefix.size()-1), val));
        }else{
            prefix.add(val);
        }
    }
    
    public void pop() {
        stak.remove(stak.size()-1);
        prefix.remove(prefix.size()-1);
    }
    
    public int top() {
        return stak.get(stak.size()-1);
    }
    
    public int getMin() {
        return prefix.get(prefix.size()-1);   }
}