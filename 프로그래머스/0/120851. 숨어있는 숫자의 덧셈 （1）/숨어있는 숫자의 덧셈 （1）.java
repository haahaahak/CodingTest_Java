class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String result = my_string.replaceAll("[a-zA-Z]", "");
        
        for (String str: result.split("")) {
            answer += Integer.valueOf(str);
        }
        
        return answer;
    }
}