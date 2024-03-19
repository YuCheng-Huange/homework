import java.util.*;

public class JPA306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Input :");
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (m == 999){
                break;
            }else{
                double total = Math.pow(m, n);
                System.out.println((int)total);
            }
            
        }
        sc.close();
    }
}
