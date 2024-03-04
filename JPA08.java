import java.util.*;;

public class JPA08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("input:");
            int grade = scn.nextInt();

            if (grade >= 90)
                System.err.println("Your grade is A");
            else if (90 > grade && grade>= 80)
                System.out.println("Your grade is B");
            else if (80 > grade && grade >= 70)
                System.out.println("Your grade is C");
            else if (70 > grade && grade >= 60)
                System.out.println("Your grade is D");
            else
                System.out.println("Your grade is F");
        }
        scn.close();

    }
}
