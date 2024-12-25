class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....",".."
            ,".---","-.-",".-..","--","-.","---",".--."
            ,"--.-",".-.","...","-","..-","...-",".--"
            ,"-..-","-.--","--.."
        };
        
        String[] letterStr = letter.split(" ");
        
        for (String str: letterStr) {
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(str)) answer += (char) (i + 97);
            }
        }
        
        
        return answer;
    }
}