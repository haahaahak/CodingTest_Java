import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        Member[] members = new Member[N];
        
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            int age = Integer.parseInt(line[0]);
            String name = line[1];
            members[i] = new Member(age, name, i);
        }
        
        Arrays.sort(members, (m1, m2) -> {
            if (m1.age == m2.age) {
                return Integer.compare(m1.index, m2.index);
            }
            return Integer.compare(m1.age, m2.age);
        });
        
        for (Member member : members) {
            sb.append(member.age).append(" ").append(member.name).append("\n");
        }
        
        System.out.print(sb.toString());
    }
    
    static class Member {
        int age;
        String name;
        int index;
        
        public Member(int age, String name, int index) {
            this.age = age;
            this.name = name;
            this.index = index;
        }
    }
}