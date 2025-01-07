class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        int[] cntX = new int[10];
        int[] cntY = new int[10];
        
        for (char ch: X.toCharArray()) {
            cntX[ch - '0']++;
        }
        
        for (char ch: Y.toCharArray()) {
            cntY[ch - '0']++;
        }
        
        for (int i = 9; i >= 0; i--) {
            int cnt = Math.min(cntX[i], cntY[i]);
            for (int j = 0; j < cnt; j++) {
                answer.append(i);
            }
        }
        
        if (answer.length() == 0) return "-1";
        if (answer.toString().equals("0".repeat(answer.length()))) return "0";
        
        return answer.toString();
    }
}