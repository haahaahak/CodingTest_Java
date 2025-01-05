class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.replace(" ", "").split("\\+");
        
        int x = 0;
        int num = 0;
        
        for (String str: arr) {
            if (str.contains("x")) {
                String xnum = str.replace("x", "");
                x += xnum.isEmpty() ? 1 : Integer.parseInt(xnum);
            } else {
                num += Integer.parseInt(str);
            }
        }
        
        StringBuilder result = new StringBuilder();
        if (x != 0) {
            result.append(x == 1 ? "x" : x + "x");
        }
        if (num != 0) {
            if (result.length() > 0) {
                result.append(" + ");
            }
            result.append(num);
        }
        
        return result.toString();
    }
}