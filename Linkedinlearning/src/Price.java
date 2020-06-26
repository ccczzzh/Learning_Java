public class Price {
    // replace void with double, the result return from this function will be
    // double result.
    public static double calculateTotalMealPrice(double ListedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * ListedMealPrice;
        double tax = taxRate * ListedMealPrice;
        double result = ListedMealPrice + tip + tax;
        //System.out.println("Your total meal price is " + result);
        return result;
    }

    public static void main(String[] args){
        //calculateTotalMealPrice(15,0.2,0.08);
        double groupTotalMealPrice = calculateTotalMealPrice(100,0.2,0.08);
        System.out.println(groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println("The individual price is " + individualMealPrice);

    }
}
