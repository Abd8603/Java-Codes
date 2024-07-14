import java.util.Scanner;
public class TowerOfHanoi {
    int count = 0;
    public static void helper(int n, int start, int helper, int from){
        if(n == 1){
            System.out.println("Transfering")
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        helper(n, 1, 2, 3);
        System.out.println(count);
    }
}
