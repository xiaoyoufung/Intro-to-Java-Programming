package Exercise_16;
import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        // Create a scanner
        Scanner input = new Scanner(System.in);

        System.out.println("What is " + number1 + " + " + number2 + "? " );
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            if (answerList.contains(answer)) {
                System.out.println("You already entered " + answer);
            } else{
                answerList.add(answer);
            }
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }

        input.close();
        System.out.println("You got it!");
    }
}
