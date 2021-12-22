class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        
        if (strs != null && strs.length > 0) {
        
            Arrays.sort(strs);
            
            char [] first = strs[0].toCharArray();
            char [] last = strs[strs.length - 1].toCharArray();
            
            for (int i = 0; i < first.length; i++) {
                if (last.length > i && last[i] == first[i]) {
                    result.append(last[i]);
                } else {
                    return result.toString();
                }
            }
        }
        return result.toString();
    }
}  
