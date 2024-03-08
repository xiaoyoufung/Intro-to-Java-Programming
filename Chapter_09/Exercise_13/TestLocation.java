package Exercise_13;

import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int rowNum = input.nextInt();
        int colNum = input.nextInt();
        double[][] numbers = new double[rowNum][colNum];

        System.out.println("Enter the array: ");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = input.nextDouble();
            }
        }
        input.close();
        
        System.out.println("The location of the largest element is " + locateLargest(numbers).maxValue + " at " + "(" + locateLargest(numbers).row + ", " + locateLargest(numbers).column + ")" );

    }

    public static Location locateLargest(double[][] a){
        Location largestLocation = new Location(0, 0, 0);

        for (int n = 0; n < a.length; n++) {
            for (int m = 0; m < a[0].length; m++) {
                if(largestLocation.maxValue < a[n][m]){
                    largestLocation.maxValue = a[n][m];
                    largestLocation.row = n;
                    largestLocation.column = m;
                }
            }
        }

        return largestLocation;
    }
}
