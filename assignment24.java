import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            HashSet<String> groups = new HashSet<>();

            for (int i = 0; i < N; i++) {
                String s = sc.next();

                int[] freq = new int[26];

                for (char c : s.toCharArray())
                    freq[c - 'a']++;

                groups.add(Arrays.toString(freq));
            }

            System.out.println(groups.size());
        }

        sc.close();
    }
}
