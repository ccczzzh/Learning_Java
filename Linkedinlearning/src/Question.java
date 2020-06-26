import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        String Question = "What is your name?";
        String A = "23";
        String B = "34";
        String C = "31";

        String correctAnswer = C;
        //String answer = "";
        System.out.println(Question);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println("Input your answer: ");
        Scanner input = new Scanner((System.in));
        String answer = input.nextLine();
        if (answer.equals(correctAnswer)) {
            System.out.println("Congre!");
        } else {
            System.out.println("Wrong answer!" + " The correct answer is " + correctAnswer);
        }


    }
}
