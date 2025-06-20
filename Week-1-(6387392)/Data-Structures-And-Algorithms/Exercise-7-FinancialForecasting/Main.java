import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        double initialValue = 10000.0;      
        double growthRate = 0.10;          
        int forecastYears = 5;

        double futureValueRecursive = FinancialForecaster.forecastRecursive(initialValue, growthRate, forecastYears);
        System.out.println("Future value using recursion after " + forecastYears + " years: ₹" + futureValueRecursive);

        HashMap<Integer, Double> memo = new HashMap<>();
        double futureValueMemo = FinancialForecaster.forecastMemo(initialValue, growthRate, forecastYears, memo);
        System.out.println("Future value using memoization after " + forecastYears + " years: ₹" + futureValueMemo);
    }
}
