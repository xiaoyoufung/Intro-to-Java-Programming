package Exercise_03;

import java.util.Scanner;

public class ArrayIndexOutboundDemo {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        
        try {
            // create an array with 100 randomly chosen integer
            int[] numbers = new int[100];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (int) (Math.random() + 10);
            }

            // input index of array from the user
            Scanner input = new Scanner(System.in);
            System.out.print("Enter array's index: ");
            int index = input.nextInt();
            input.close();
            
            System.out.println(numbers[index]);
            
        } catch (Exception e) {
            System.out.println("Out of Bounds.");
        }
        
        
    }
    
}
