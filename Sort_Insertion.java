import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sort_Insertion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = s.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i = 1; i < array.length; i++){
            int value = array[i];
            int j = i - 1;
            while ((j > -1) && (array[j] > value)){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
