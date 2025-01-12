class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (String b : babbling) {
            boolean isValid = true;

            for (String word : words) {
                if (b.contains(word.repeat(2))) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                for (String word : words) {
                    b = b.replace(word, " ");
                }
                
                b = b.replace(" ", "");
                
                if (b.isEmpty()) {
                    answer++;
                }
            }
        }

        return answer;
    }
}