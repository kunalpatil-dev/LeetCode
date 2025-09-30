class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        int n = strs.length;
        String prefix = strs[0];
        int prefixLen = strs[0].length();
        for (int i = 1; i < n; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.length() == 0) {
                return res;
            }
        }
        return prefix;
    }

}