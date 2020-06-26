import java.util.Scanner;

public class TeaTime {

    //Create a Function
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time..");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");

    }
    // main function
    public static void main(String[] args) {
        System.out.println("Welcome to your new job");

        // call the function announceDeveloperTeaTime
        announceDeveloperTeaTime();

        System.out.println("Write code");

        // call the function announceDeveloperTeaTime again
        announceDeveloperTeaTime();

        System.out.println("GET PROMOTED!");


    }
}
