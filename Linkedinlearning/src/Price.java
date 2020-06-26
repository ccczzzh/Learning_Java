public class Price {

    public static void calculateTotalMealPrice(double ListedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * ListedMealPrice;
        double tax = taxRate * ListedMealPrice;
        double result = ListedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
    }

    public static void main(String[] args){
        calculateTotalMealPrice(15,0.2,0.08);
        calculateTotalMealPrice(25,0.18,0.08);


    }
}
