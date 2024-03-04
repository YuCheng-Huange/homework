import java.util.*;

public class JPA03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i<2 ; i++){
            System.out.print("Input an integer: ");
            int n1 = sc.nextInt();

            if (n1 % 2 == 0){
                System.out.println("The number is even. ");
            }else{
                System.out.println("The number is odd.");
            }

        }
        sc.close();
    }
}
