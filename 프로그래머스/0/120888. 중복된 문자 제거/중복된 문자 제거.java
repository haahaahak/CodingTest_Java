import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        Set<Character> seen = new HashSet<>();
        StringBuilder answer = new StringBuilder();

        for (char ch : my_string.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                answer.append(ch);
            }
        }

        return answer.toString();
    }
}