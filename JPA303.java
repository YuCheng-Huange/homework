public class JPA303 {
    public static void main(String[] args) {
        System.out.print("1~1000中的完美數有: ");

        for (int i = 0; i < 1000; i++) {
            int total = 0;
            for (int j = 0; j < i; j++) {
                if (i % j == 0)
                    total += j;
            }
            if (total == i)
                System.out.print(i);
        }
    }
}
