import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // Number of elements

            Set<Long> distinct = new HashSet<>();

            for (int i = 0; i < N; i++) {
                long num = sc.nextLong();
                distinct.add(Math.abs(num));
            }

            System.out.println(distinct.size());
        }

        sc.close();
    }
}
