package test2;

public class Sample {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "luffy is still joyboy";
        System.out.println(solution.lengthOfLastWord(s));
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }
}
