import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double totalScore = 0.0;
        double totalCredit = 0.0;
        
        String[] grades = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] scores = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken(); // 사용안함
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            
            if (grade.equals("P")) continue;
            
            double gradeScore = 0.0;
            for (int j = 0; j < grades.length; j++) {
                if (grade.equals(grades[j])) {
                    gradeScore = scores[j];
                    break;
                }
            }
            
            totalCredit += credit;
            totalScore += credit * gradeScore;
        }
        
        System.out.printf("%.6f", (totalCredit == 0) ? 0.0 : totalScore / totalCredit);
    }
}