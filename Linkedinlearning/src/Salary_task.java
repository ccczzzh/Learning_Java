public class Salary_task {

    public static void SalaryCalculation(double workTimeHPerWeek,
                                         double ratePerHour,
                                         double vacationDays){
        if(workTimeHPerWeek < 0 ) {
            System.out.println("work time is invalid!");
        }
        if(ratePerHour < 0) {
            System.out.println("rate per hour is invalid!");
        }

        double Bonus = vacationDays * 8;
        double totalWeek = 52 ;
        double workTime = workTimeHPerWeek * totalWeek - Bonus;
        double grossYearly = ratePerHour * workTime;
        System.out.println(grossYearly);

    }

    public static void main(String[] args) {

        SalaryCalculation(40,15,8);
    }
}
