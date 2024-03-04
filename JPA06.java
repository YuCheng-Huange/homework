import java.util.*;;

public class JPA06 {
    public static void main(String[] args) {
        int criteria = 60;
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Input Chinese Score:");
            int chineseScore = scn.nextInt();

            System.out.print("Input English Score:");
            int englishScore = scn.nextInt();

            System.out.print("Input Math Score:");
            int mathScore = scn.nextInt();

            if ( chineseScore < criteria && englishScore < criteria && mathScore < criteria)
                System.out.println("Chinese Failed\nEnglish Failed\nMath Failed");
            
            else if (chineseScore < criteria && mathScore < criteria)
                System.out.println("Chinese Failed\nMath Failed");
            
            else if (chineseScore < criteria && englishScore < criteria)
                System.out.println("Chinese Failed\nEnglish Failed");

            else if (englishScore < criteria && mathScore < criteria)
                System.out.println("English Failed\nMath Failed");

            else if (chineseScore < criteria)
                System.out.println("Chinese Failed");

            else if (englishScore < criteria)
                System.out.println("English Failed");
            
            else if (mathScore < criteria)
                System.out.println("Math Failed");

            else
                System.out.println("All Pass");

            
        }
        scn.close();
    }
}
