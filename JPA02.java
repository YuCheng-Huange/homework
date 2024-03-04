import java.util.Scanner;

public class JPA02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i>2 ; i++){
            System.out.print("Input: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if (n1>n2){
                System.out.println("The first number is greater. ");
            } else if(n1<n2) {
                System.out.println("The second number is greater. ");
            } else {
                System.out.println("Both numbers is equal.");
            }

        }
        
        sc.close();
    }
}

