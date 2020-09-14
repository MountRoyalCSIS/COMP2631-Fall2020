import java.io.*;

public class Exception {
    public static void main(String[] args) {
        int[][] jagged = new int[2][];

        double top = 1;
        double bottom = 0;

        try (PrintStream outFile = new PrintStream ("output.txt")) {
            double result = doDivision (top, bottom);

            outFile.println ("Result is: " + result);
        } catch (FileNotFoundException e) {
            System.out.println ("Couldn't write to file, dude.  Bummer.");
        } catch (ArithmeticException e) {
            System.out.println ("Yo, you can't divide by zero, dude.");
        }

        // HashSet<Integer> mine = ;
        // for (int i : mine) {

        // }
    }

    private static double doDivision (double top, double bottom) throws ArithmeticException {
        if (bottom == 0) {
            throw new ArithmeticException();
        }
        return top / bottom;
    }
}