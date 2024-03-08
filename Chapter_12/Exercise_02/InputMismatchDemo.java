package Exercise_02;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchDemo {
    public static void main(String[] args) throws InputMismatchException {
        boolean inputed = false;
       do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter two integer: ");
        
                int number1 = input.nextInt();
                int number2 = input.nextInt();

                input.close();

                System.out.println("Sum is " + (number1 + number2));

                inputed = true;

            } catch (Exception e) {
                System.out.println("Error, enter non integer value.");
            }   
       } while (!inputed);
    }
}
