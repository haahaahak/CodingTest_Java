class Solution {
    public String solution(String new_id) {
        
        // step 1: 대문자 -> 소문자 치환
        new_id = new_id.toLowerCase();
        
        // step 2: 허용 문자
        new_id = new_id.replaceAll("[^a-z0-9\\-_.]", "");
        
        // step 3: 마침표 중복
        new_id = new_id.replaceAll("\\.+", ".");
        
        // step 4: 마침표 위치 확인
        new_id = new_id.replaceAll("^\\.|\\.$", "");

        // step 5: 공백 문자열
        new_id = "".equals(new_id) ? "a" : new_id;
        
        // step 6: 문자열 길이
        if (new_id.length() >= 16)
            new_id = new_id.substring(0, 15).replaceAll("\\.$", "");
        
        // step 7: 문자열 길이 2
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }
        
        return new_id;
    }
}