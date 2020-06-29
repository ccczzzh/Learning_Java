public class studentFile {
    String firstName;
    String lastName;
    int expectYearToGrad;
    double GPA;
    String DeclaredMajor;

    public studentFile(String firstName,String lastName,int expectYearToGrad,
            double GPA,String DeclaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectYearToGrad = expectYearToGrad;
        this.GPA = GPA;
        this.DeclaredMajor = DeclaredMajor;
    }
    public void GradYear() {
        this.expectYearToGrad = this.expectYearToGrad + 1;
    }

}

