import java.util.Scanner;

public class Assignment1 {



  public void addition() {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a number to add");
    int num1 = Integer.parseInt(myObj.nextLine());
    System.out.println("Enter next number to add");
    int num2 = Integer.parseInt(myObj.nextLine());
    myObj.close();
    System.out.println("The Answer is " + (num1 + num2));

  }

  public static void main(String[] args) throws Exception {
    Assignment1 add = new Assignment1();
    add.addition();
  }
}
