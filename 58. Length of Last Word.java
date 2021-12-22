class Solution {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int cnt = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                continue;
            }
            cnt++;
            if (i > 0 && chars[i - 1] == ' ') {
                break;
            }
        }
        return cnt;
    }
}
