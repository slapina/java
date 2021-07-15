import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ElementSearch_Binary {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = s.nextInt();
        System.out.println("Enter a number to search");
        int num = s.nextInt();
        int[] array = new int[size];
        Random random = new Random();

        for(int i = 0; i< array.length; i++){
            array[i] = random.nextInt(100);
        }

        long before = System.currentTimeMillis();
        Arrays.sort(array, 0, size);
        System.out.println(Arrays.toString(array));

        int key = Arrays.binarySearch(array, num);
        if(key > 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        long after = System.currentTimeMillis();
        System.out.println("Program execution time: "+ (after - before));
        }
    }
