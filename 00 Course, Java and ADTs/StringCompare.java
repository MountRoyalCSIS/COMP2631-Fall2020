import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String a;
        String b;

        System.out.print ("Enter one word (a): ");
        a = keyboard.next ();

        System.out.println ("Enter a line of text (b): ");
        keyboard.nextLine (); // remove newline after previous word
        b = keyboard.nextLine ();

        if (a.compareTo(b) < 0) {
            System.out.println ("a is \"less than\" b");
        } else if (a.equals(b)) {
            System.out.println ("a is \"equal to\" b");
        } else {
            System.out.println ("a is \"greater than\" b");
        }

        Circle myCircle = new Circle ();
        Circle myCircle(); // compiler error
    }
}
