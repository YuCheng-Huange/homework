import java.util.*;

public class JPA304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double total = 0;
        while (true) {
            System.out.print("Please enter meal dollars or enter -1 to stop: ");
            double price = sc.nextDouble();

            if (price == -1){
                break;
            }else
            
                count++;
                total += price;
        }

        if (count == 0){
            System.out.println("No meals entered.");
        }else{
            double average = total/5;
            System.out.println("餐點總費用:" + total);
            System.out.printf("%d 道餐點平均費用為: %.2f",count,average);
        }
        sc.close();
    }
}
