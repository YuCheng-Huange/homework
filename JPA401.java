import java.util.*;

public class JPA401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        System.out.println("請輸入10個整數 : ");
        for (int i = 0; i < 10; i++){
            System.out.print("第" + (i+1) + "個整數 : ");
            num[i] = sc.nextInt();

        }
        int count = 0;
        int sum = 0;

        for (int nums : num){
            if (nums > 60){
                count++;
                sum += nums;
            }
        }
        double average = (double)sum / count;
        System.out.printf("陣列中大於60的有%d個",count);
        System.out.println();
        System.out.println("總和為"+sum);
        System.out.println("平均值為" + average);
        sc.close();
    }
}
