import java.util.Arrays;
import java.util.Scanner;

public class DogsDemo {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many dogs?");
        int amount = s.nextInt();
        Dog [] dogs= new Dog [amount];

        System.out.println("Input dogs' features");

        Scanner a = new Scanner(System.in);
        String st = a.nextLine();
        a = new Scanner(st).useDelimiter("\\s");
        for(int i = 0; i< amount; i++){
            String name = a.next();
            String size = a.next();
            int age = a.nextInt();

            dogs [i] = new Dog(name, size, age);
        }


        System.out.println(Arrays.toString(dogs));
    }
    }

