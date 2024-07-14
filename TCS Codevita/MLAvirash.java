import java.util.Arrays;
import java.util.Scanner;

public class MLAvirash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m1 = scanner.nextInt(); // Average time in minutes taken for vaccination by the first centre
        int m2 = scanner.nextInt(); // Average time in minutes taken for vaccination by the second centre

        int N = scanner.nextInt(); // Number of villages in the constituency
        int[] villages = new int[N];

        for (int i = 0; i < N; i++) {
            villages[i] = scanner.nextInt(); // Population of villages
        }

        Arrays.sort(villages);

        int maxTime = 0;
        int left = 0;
        int right = N - 1;

        while (left <= right) {
            int total1 = 0;
            int total2 = 0;

            // Calculate the time taken by the first center
            if (villages[left] * m1 <= m2) {
                total1 = villages[left] * m1;
                left++;
            } else {
                int remaining = villages[left] - (int) Math.ceil((double) m2 / m1);
                total1 = m2 + remaining * m2;
                left++;
            }

            // Calculate the time taken by the second center
            if (villages[right] * m2 <= m1) {
                total2 = villages[right] * m2;
                right--;
            } else {
                int remaining = villages[right] - (int) Math.ceil((double) m1 / m2);
                total2 = m1 + remaining * m1;
                right--;
            }

            maxTime += Math.max(total1, total2);
        }

        System.out.println(maxTime);
    }
}
