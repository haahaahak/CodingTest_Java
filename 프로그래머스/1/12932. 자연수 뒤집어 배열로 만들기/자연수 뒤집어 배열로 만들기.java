class Solution {
    public int[] solution(long n) {
        String toStr = Long.toString(n);
        
        int[] answer = new int[toStr.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = toStr.charAt(answer.length - 1 - i) - '0';
        }
        
        return answer;
    }
}