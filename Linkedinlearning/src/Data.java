import java.util.Scanner;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        //char studentFirstInitial = 'Z';
        //char studentLastInitial = 'C';
        boolean hasPerfectAttendance = true;
        String studentFirstName = "铮";
        String studentLastName = "崔";

        System.out.println("First Name = " + studentFirstName);
        System.out.println("Last Name = " + studentLastName);
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        System.out.println("Student age = " + studentAge);
        System.out.println("Student GPA = " + studentGPA);
        System.out.println("First Initial = " + studentFirstInitial);
        System.out.println("Last Initial = " + studentLastInitial);
        System.out.println("Perfect Attendance ? = " + hasPerfectAttendance);


        System.out.println("What do you want to update it to?");
        // input data in JAVA
        Scanner input = new Scanner((System.in));
        studentGPA = input.nextDouble();
        // output data in JAVA
        System.out.println(studentFirstName + " " + studentLastName +
                " now has a GPA of " + studentGPA);

    }
}
