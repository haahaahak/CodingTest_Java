import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
                
        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                sb.append(key);
            }
        }
        
        char[] answer = sb.toString().toCharArray();
        Arrays.sort(answer);
        
        return String.valueOf(answer);
    }
}