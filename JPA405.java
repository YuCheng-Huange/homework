import java.lang.String;

public class JPA405 {
    public static void main(String[] args) {
        String[] array = {"A","B","C","D","E","F","D","H","I","J"};
        System.out.print("反轉陣列資料之前: ");
        printArray(array);
        reverseArray(array);
        System.out.print("反轉陣列資料之後: ");
        printArray(array);
        
    }

    public static void reverseArray(String[] array) {
        int start = 0;
        int end = array.length-1;
        while (start < end) {
            String temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(String[] array){
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }    
}
