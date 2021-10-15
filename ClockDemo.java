import java.util.Scanner;

public class ClockDemo {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter seconds after midnight");
        Clock firstClock = new Clock (s.nextInt());
        for(int i = 0; i< 10; i ++) {
            firstClock.tick();
            System.out.println(firstClock.toUniversalString());
        }
        System.out.println("Enter hours, minutes and seconds");
        Clock secondClock = new Clock(s.nextInt(),s.nextInt(),s.nextInt());
        for(int i = 0; i< 10; i ++) {
            secondClock.tick();
            System.out.println(secondClock.toUniversalString());
        }
        firstClock.addClock(secondClock);
        System.out.println(firstClock.toUniversalString());
        System.out.println(secondClock.toUniversalString());
        firstClock.subtractClock(secondClock);
        System.out.println(firstClock.toUniversalString());
    }
}
