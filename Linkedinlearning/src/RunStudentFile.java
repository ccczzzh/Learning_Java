public class RunStudentFile {

    public static void main(String[] args) {
        studentFile studentOne = new studentFile("zheng", "Cui", 2019,3.0,"Upper Second");
        studentFile studentTwo = new studentFile("jingwen", "Wang", 2024, 3.5, "first honor");

        studentOne.GradYear();
        System.out.println(studentOne.expectYearToGrad);
    }
}
