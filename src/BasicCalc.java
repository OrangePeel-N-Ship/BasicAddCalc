import java.util.Scanner;

public class BasicCalc {
    public static void main(String [] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter 1st Whole number: ");
        double num1 = Input.nextDouble();
        System.out.print("Enter 2nd Whole number: ");
        double num2 = Input.nextDouble();
        System.out.println( num1 + num2);
  }
}

