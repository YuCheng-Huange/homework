import java.util.*;

public class JPA04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++){
            System.out.print("Input: ");
            int n1 = sc.nextInt();

            if (n1 % 5 == 0 && n1 % 9 == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
        }
        sc.close();
    }
}
