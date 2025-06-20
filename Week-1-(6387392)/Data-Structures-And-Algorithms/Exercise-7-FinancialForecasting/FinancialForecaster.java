import java.util.HashMap;

public class FinancialForecaster {

    // Recursive function to forecast future value for year n
    public static double forecastRecursive(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return forecastRecursive(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized using memoization
    public static double forecastMemo(double currentValue, double growthRate, int years, HashMap<Integer, Double> memo) {
        if (years == 0) {
            return currentValue;
        }
        if (memo.containsKey(years)) {
            return memo.get(years);
        }
        double value = forecastMemo(currentValue, growthRate, years - 1, memo) * (1 + growthRate);
        memo.put(years, value);
        return value;
    }
}
