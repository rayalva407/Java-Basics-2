package Assignment3;

public class Circle implements Shape {
  int radius;
  public final double pi = 3.14159;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public void calculateArea() {
    double area = pi * (this.radius * this.radius);
    System.out.println(area);
  }

  @Override
  public void display() {
    System.out.println("    *    "); 
    System.out.println(" *     *  ");
    System.out.println("    *    ");
  }

  
}
