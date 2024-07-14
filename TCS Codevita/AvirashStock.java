
//Code By Avirash Badgainyan
//Importing Scanner
import java.util.Scanner;

//
public class AvirashStock {
    // Logic of the Code
    private static void solve(int N, int M, int D, int[][] st, int[][] stday) {
        int rl = 0; // Realized Stock
        int url = 0; // Unrealized Stock
        for (int o = 0; o < N; o++) {
            int x = st[o][1];//Quantity of Stock
            int y = st[o][2];//Buy Date
            int z = st[o][3];//Sell Date
            if (y <= D &&(z > D || z == 0)) {
                url += x * (stday[o][D - 1] - stday[o][y - 1]);  // Urealized 
            }else if(y <= D) {
                rl += x * (stday[o][z - 1] - stday[o][y - 1]);  //Realized
            }
        }
        System.out.println(rl);
        System.out.print(url);
    }


    // Driver Part of the Code
    public static void main(String[] args) {
        Scanner abd = new Scanner(System.in);
        int N = abd.nextInt(); // Number of Stock
        int[][] st = new int[N][3]; // St --> <Quantity of Stock bought, time of purchase, time of sell, array of
                                    // prices>
        // Loop to get Input
        for (int o = 0; o < N; o++) {
            st[o][0] = abd.nextInt();
            st[o][1] = abd.nextInt();
            st[o][2] = abd.nextInt();
        }
        int M = abd.nextInt(); // Number of Days
        int[][] stday = new int[N][M];// Stock Price at Respective Day, Array to store this
        for (int o = 0; o < N; o++) {
            for (int p = 0; p < M; p++) {
                stday[o][p] = abd.nextInt();
            }
        }

        int D = abd.nextInt();
        solve(N, M, D, st, stday);
        abd.close();
    }

}