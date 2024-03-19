import java.util.*;

public class JPA307 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input: ");
            int m = sc.nextInt();
            if(m == 999){
                break;
            }
            int n = sc.nextInt();

            int gcd = GCD(m,n);
            System.out.println(gcd);

        }
        sc.close();
    }
    public static int GCD(int m , int n){
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }
}