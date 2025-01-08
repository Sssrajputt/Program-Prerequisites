import java.util.*;

public class CelsiusToFahrenheitConversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        int celsius = sc.nextInt(); // Corrected spelling

        // Calculate Fahrenheit
        float fahrenheit = (celsius * 1.8f) + 32; // Single-step calculation

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        sc.close(); // Close scanner to avoid resource leak
    }
}
 