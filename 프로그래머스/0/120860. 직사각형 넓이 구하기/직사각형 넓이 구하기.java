class Solution {
    public int solution(int[][] dots) {
        int x = 0;
        int y = 0;
        
        for (int i = 1; i < dots.length; i++) {
            if (dots[0][0] != dots[i][0])
                x = Math.abs(dots[0][0] - dots[i][0]);
            if (dots[0][1] != dots[i][1])
                y = Math.abs(dots[0][1] - dots[i][1]);
        }
    
        return x * y;
    }
}