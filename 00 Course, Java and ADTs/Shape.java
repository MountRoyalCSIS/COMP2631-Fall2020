public abstract class Shape implements Areable {
  private double x;
  private double y;

  public Shape (double newX, double y) {
    this.x = newX;
    this.y = y;
  }

  public double getX () {
    return x;
  }

  public void setX (double x) {
    this.x = x;
  }

  public double getY () {
    return y;
  }

  public void setY (double y) {
    this.y = y;
  }

  public abstract double getArea ();
}
