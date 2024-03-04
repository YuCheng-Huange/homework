import java.util.*;

public class JPA01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<2; i++){
            System.out.print("Please enter score: ");
            int score = sc.nextInt();

            if(score >= 60){
                System.out.println("You pass");
            }

            System.out.println("End");
        }
        sc.close();    
    }
}
    