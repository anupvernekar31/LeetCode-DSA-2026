class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = stack.length();

            if (n > 0 && stack.charAt(n - 1) == c) {
                stack.deleteCharAt(n - 1); // remove the duplicate pair
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}