class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = "abcdefghij";
        
        String[] strArr = String.valueOf(age).split("");
        
        for (int i = 0; i < strArr.length; i++) {
            answer += ageStr.charAt(Integer.valueOf(strArr[i]));
        }
        
        return answer;
    }
}