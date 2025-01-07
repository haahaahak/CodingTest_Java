import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]","");
        
        int[] answer = new int[my_string.length()];
        int idx = 0;
        for (char ch: my_string.toCharArray()) {
            answer[idx++] = Character.getNumericValue(ch);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}