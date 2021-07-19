import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class CountElements {
    public static void main (String[] args){
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a symbol");
        char symbol = s.next().charAt(0);
        int count = StringUtils.countMatches(text, symbol);
        System.out.println("Number of occurrences: " + count);
    }
}
