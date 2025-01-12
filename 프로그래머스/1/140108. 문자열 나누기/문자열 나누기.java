class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        int other = 0;
        char ch = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            } else {
                other++;
            }

            if (count == other) {
                answer++;
                if (i + 1 < s.length()) {
                    ch = s.charAt(i + 1);
                }
                count = 0;
                other = 0;
            }
        }

        if (count != 0 || other != 0) {
            answer++;
        }

        return answer;
    }
}