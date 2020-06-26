import java.util.Scanner;

public class Main {

    public  static void main(String[] args) {
        //System.out.println("Pick a number between 1 and 10");

        //Scanner scanner = new Scanner(System.in);

        //int inputtedNum = scanner.nextInt();

        //if (inputtedNum < 5) {
        //    System.out.println("Enjoy the good luck a friend brings you");
        //} else {
        //  System.out.println("Your shoe selection will make you very happy today");
        //}
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat){
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? if so, answer yes");
            String userInput = input.next();

            if(userInput.equals("yes")) {
                isOnRepeat = false;

            }
        }
        System.out.println("Playing next song");

    }
}
