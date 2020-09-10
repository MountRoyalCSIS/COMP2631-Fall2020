public class Program {
  //private String myField;

  public static void main (String [] args) {
    Program program = new Program ();

    program.run ();
  }

  public void run () {
    final Shape shapey = new Circle (1, 2, 3);

    shapey.setX(28);

    System.out.println ("Area of shapey is: " + shapey.getArea());
  }
}
