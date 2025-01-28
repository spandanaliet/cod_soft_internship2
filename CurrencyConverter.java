import java.util.Scanner;

public class CurrencyConverter {

    // A method to get the conversion rate for base-to-target currency
    public static double getConversionRate(String baseCurrency, String targetCurrency) {
        // Predefined exchange rates (for example purposes)
        // These rates are hardcoded. In a real-world scenario, these rates would be dynamic or fetched from an external source.
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.85;  // 1 USD = 0.85 EUR
        } else if (baseCurrency.equals("USD") && targetCurrency.equals("INR")) {
            return 74.50; // 1 USD = 74.50 INR
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return 1.18;  // 1 EUR = 1.18 USD
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("INR")) {
            return 87.50; // 1 EUR = 87.50 INR
        } else if (baseCurrency.equals("INR") && targetCurrency.equals("USD")) {
            return 0.013; // 1 INR = 0.013 USD
        } else if (baseCurrency.equals("INR") && targetCurrency.equals("EUR")) {
            return 0.011; // 1 INR = 0.011 EUR
        }
        // Return -1 if no conversion rate is found
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take base currency and target currency from user
        System.out.print("Enter the base currency (USD, EUR, INR): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency (USD, EUR, INR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Fetch the conversion rate
        double exchangeRate = getConversionRate(baseCurrency, targetCurrency);

        if (exchangeRate == -1) {
            System.out.println("Error: Conversion rate not available for " + baseCurrency + " to " + targetCurrency);
            return;
        }

        // Take amount to convert
        System.out.print("Enter the amount in " + baseCurrency + ": ");
        double amount = scanner.nextDouble();

        // Convert the amount
        double convertedAmount = amount * exchangeRate;

        // Display the result
        System.out.printf("%.2f %s is equal to %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);

        scanner.close();
    }
}
