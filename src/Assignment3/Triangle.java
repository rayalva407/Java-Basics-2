package Assignment3;

public class Triangle implements Shape {
  int base;
  int height;

  public Triangle(int base, int height) {
    this.base = base;
    this.height = height;
  }

  @Override
  public void calculateArea() {
    double area = (this.base / 2) * this.height;
    System.out.println(area);
  }

  @Override
  public void display() {
    System.out.println("   *  ");
    System.out.println("  *** ");
    System.out.println(" ***** ");
    System.out.println("******* ");
  }
}
