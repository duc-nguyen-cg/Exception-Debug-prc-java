import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    //creat an array of 100 random integers between 0 and 100
    public int[] createRandom(){
        Random rd = new Random();
        int[] array = new int[100];
        System.out.println("List of elements: " );
        for (int i = 0; i< 100; i++){
            array[i] = rd.nextInt(100);
            System.out.print(array[i]+"  ");
        }
        return array;
    }


    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        int[] testArray = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + testArray[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
