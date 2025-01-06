class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for (int i = 1; i < numLog.length; i++) {
            answer += cal(numLog[i], numLog[i - 1]);
        }
        
        return answer;
    }
    
    private String cal(int num, int prev) {
        switch (num - prev) {
            case 1: return "w";
            case -1: return "s";
            case 10: return "d";
            case -10: return "a";
            default: return "";
        }
    }
}