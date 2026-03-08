class Solution {
    public String removeStars(String s) {
        StringBuilder r = new StringBuilder();

        for(int i=0;i<s.length();i++){
            int n = r.length();
            if(s.charAt(i) == '*' && n>0){
                r.deleteCharAt(n-1);
            } else {
                r.append(s.charAt(i));
            }
        }
        return r.toString();
        
    }
}