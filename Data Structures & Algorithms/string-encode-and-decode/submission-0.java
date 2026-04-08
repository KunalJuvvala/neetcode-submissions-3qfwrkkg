class Solution {

    public String encode(List<String> strs) {
        String res="";
        for(int i=0; i<strs.size(); i++){
            res+=strs.get(i)+".";
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> res= new ArrayList<>();
        String temp = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='.'){
                res.add(temp);
                temp = "";
            }else{
                temp+=str.charAt(i);
            }
        }
        return res;
    }
}
