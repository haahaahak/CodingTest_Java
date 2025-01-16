class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        
        int pword = 0;
        int yword = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'p') pword++;
            if (ch == 'y') yword++;
        }

        return pword == yword;
    }
}