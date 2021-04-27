package Assignment3;


public class Rectangle implements Shape {
  int sideA;
  int sideB;

  public Rectangle(int sideA, int sideB) {
    this.sideA = sideA;
    this.sideB = sideB;
  }

  @Override
  public void calculateArea() {
    double area = this.sideA * this.sideB;
    System.out.println(area);
    
  }

  @Override
  public void display() {
    System.out.println("*******");
    System.out.println("*******");
    System.out.println("*******");
  }
}
