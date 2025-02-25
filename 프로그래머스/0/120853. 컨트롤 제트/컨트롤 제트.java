class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        
        int sum = 0;
        int last = 0;
        
        for (String str: arr) {
            if ("Z".equals(str)) {
                sum -= last;
            } else {
                last = Integer.parseInt(str);
                sum += last;
            }
        }
        
        return sum;
    }
}