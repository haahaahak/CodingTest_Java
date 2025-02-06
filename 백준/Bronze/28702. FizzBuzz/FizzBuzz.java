import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        // 숫자를 찾았을 경우 담을 변수
        int num = 0;
        // 플래그
        boolean isNum = false;
        
        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            
            // 숫자를 찾기 위해 첫 글자가 문자인지 확인
            char ch = str.charAt(0);
            if (ch != 'F' && ch != 'B') {
                num = Integer.parseInt(str);
                isNum = true;
            }
            
            // 숫자를 찾았다면 무조건 다음 수는 +1
            if (isNum) {
                num++;
            }
        }
        
        if (num % 3 == 0) {
            if (num % 5 == 0) {
                System.out.print("FizzBuzz");    
            } else {
                System.out.print("Fizz");
            }
        } else {
            if (num % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(num);
            }
        }

	}
}