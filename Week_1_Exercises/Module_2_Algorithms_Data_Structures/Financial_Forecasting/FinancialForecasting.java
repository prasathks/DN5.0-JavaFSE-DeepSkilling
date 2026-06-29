public class FinancialForecasting {

    // recursive method to calculate future value
    // it takes current value, expected growth rate, and number of years
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        
        // base case: if no years left, just return the current value
        if (years == 0) {
            return currentValue;
        }
        
        // recursive case: calculate for one year less with updated value
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        
        // dummy data for testing
        double initialAmount = 1000.0; 
        double expectedGrowthRate = 0.05; // 5% growth
        int timeInYears = 10; 
        
        // call the recursive function
        double finalAmount = calculateFutureValue(initialAmount, expectedGrowthRate, timeInYears);
        
        // print the results
        System.out.println("Initial Amount: $" + initialAmount);
        System.out.println("Growth Rate: " + (expectedGrowthRate * 100) + "% per year");
        System.out.println("Time Duration: " + timeInYears + " years");
        System.out.println("Predicted Future Value: $" + String.format("%.2f", finalAmount));
    }
}
