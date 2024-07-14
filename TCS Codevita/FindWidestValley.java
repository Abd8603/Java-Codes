import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindWidestValley {
    public static double surfaceEquation(double x, double[] A, double[] B) {
        double result = 0;
        for (int i = 0; i < A.length; i++) {
            result += Math.sin(A[i] * x + B[i]);
        }
        return result;
    }

    public static List<Integer> findLocalMaxima(int n, double[] A, double[] B) {
        List<Integer> maxima = new ArrayList<>();
        for (int i = 1; i < n - 1; i++) {
            if (surfaceEquation(i - 1, A, B) < surfaceEquation(i, A, B) && surfaceEquation(i, A, B) > surfaceEquation(i + 1, A, B)) {
                maxima.add(i);
            }
        }
        return maxima;
    }

    public static int findValleyWidth(int left, int right) {
        return right - left;
    }

    public static int findWidestValley(int n, double[] A, double[] B) {
        List<Integer> maxima = findLocalMaxima(n, A, B);
        int widestValleyWidth = 0;
        int widestValleyIndex = 0;

        for (int i = 0; i < maxima.size() - 1; i++) {
            int leftMaxima = maxima.get(i);
            int rightMaxima = maxima.get(i + 1);
            int currentValleyWidth = findValleyWidth(leftMaxima, rightMaxima);

            if (currentValleyWidth > widestValleyWidth) {
                widestValleyWidth = currentValleyWidth;
                widestValleyIndex = leftMaxima + 1;
            }
        }

        return widestValleyIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input parsing
        int n = scanner.nextInt();
        double[] A = new double[n];
        double[] B = new double[n];

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextDouble();
        }

        // Output
        System.out.println(findWidestValley(n, A, B));
    }
}
