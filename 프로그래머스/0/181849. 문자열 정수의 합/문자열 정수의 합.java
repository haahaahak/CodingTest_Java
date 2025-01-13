class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        // 제한사항에 범위가 그렇게 크지 않기 때문에 charAt을 쓰는 게 더 효율적이라고 판단함.
        for (int i = 0; i < num_str.length(); i++) {
            answer += num_str.charAt(i) - '0';
        }
        
        return answer;
    }
}