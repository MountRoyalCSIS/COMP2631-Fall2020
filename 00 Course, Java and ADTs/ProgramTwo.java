import java.util.Scanner;

public class ProgramTwo {
    public static void main (String[] args) {
        int x;
        int y = 7;
        double z;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number: ");
        x = keyboard.nextInt();

        y += 2;
        z = (y / 8 * x) / 2.1;

        if (z > 2.0) {
            for (int i = 0; i < z; i++) {
                System.out.println("x = " + x);
                //cout << "x = " << x << endl;
                x = x - 2;
            }
        } else {
            System.out.println("Too small... :-(");
        }
    }
}