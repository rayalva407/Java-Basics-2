package Assignment3;

public class Main {
  
  public static void main(String[] args) {
    Triangle tri = new Triangle(6, 10);
    tri.calculateArea();
    tri.display();

    Rectangle rect = new Rectangle(10, 15);
    rect.calculateArea();
    rect.display();

    Circle circ = new Circle(5);
    circ.calculateArea();
    circ.display();
  }
}
