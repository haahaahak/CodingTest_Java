class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String orders = String.valueOf(order);
        
        for (char ch: orders.toCharArray()) {
            if (ch == '3' || ch == '6' || ch == '9')
                answer++;
        }
        
        return answer;
    }
}