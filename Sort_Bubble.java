import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sort_Bubble {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = s.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        boolean unsorted = true;
        while(unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

