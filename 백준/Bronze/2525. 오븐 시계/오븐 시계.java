import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        
        int cooking = Integer.parseInt(br.readLine());
        
        String result = timeCalculator(hour, minute, cooking);
        
        System.out.print(result);
	}
    
    public static String timeCalculator(int hour, int minute, int cooking) {
        StringBuilder sb = new StringBuilder();
        
        minute += cooking;
        hour += minute / 60;
        minute %= 60;
        
        // 24시간제
        hour %= 24;
        
        sb.append(hour).append(" ").append(minute);
        
        return sb.toString();
    }
}