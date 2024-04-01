public class JPA403 {
    final static int row = 2;
    final static int col = 3;
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6}};
        int[][] B = {{7,8,9},{10,11,12}};
        int[][] C = new int[row][col];
        System.out.printf("陣列的A內容為(3x3) :\n");
        show(A);

        System.out.printf("\n陣列B的內容為(3x3) :\n");
        show(B);

        add(A,B,C);

        System.out.println("\n陣列A+B=C，陣列C的內容為(3x3):\n");
        show(C);
    }
    public static void add(int[][] A, int[][] B, int[][] C){
        for(int i = 0;i<row; i++){
            for(int j = 0; j <col; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
    }
    public static void show(int[][] array){
        for(int[] i : array){
            for(int j : i){
                System.out.printf("%02d",j);
            System.out.println("");
            }
        }
    }
}
