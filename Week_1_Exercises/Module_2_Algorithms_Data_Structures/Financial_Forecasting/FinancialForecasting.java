public class FinancialForecasting {

    
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {

        if (years == 0) {
            return currentValue;
        }

        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double initialAmount = 1000.0; 
        double expectedGrowthRate = 0.05; 
        int timeInYears = 10; 

        double finalAmount = calculateFutureValue(initialAmount, expectedGrowthRate, timeInYears);

        System.out.println("Initial Amount: $" + initialAmount);
        System.out.println("Growth Rate: " + (expectedGrowthRate * 100) + "% per year");
        System.out.println("Time Duration: " + timeInYears + " years");
        System.out.println("Predicted Future Value: $" + String.format("%.2f", finalAmount));
    }
}
