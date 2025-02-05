import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
         
        // 1 ~ 30번 학생 체크 (0은 사용x)
        boolean[] submit = new boolean[31];
        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            // 입력 받은 값을 인덱스로 사용
            submit[num] = true;
        }
        
        for (int i = 1; i <= 30; i++) {
            // 1 ~ 30번 까지 false인 학생 출력 (1번부터 수행하므로 첫 줄에 작은 숫자가 들어가게 됨.)
            if (!submit[i]) {
                sb.append(i).append("\n");
            }
        }
        
        System.out.print(sb.toString());
    }
}