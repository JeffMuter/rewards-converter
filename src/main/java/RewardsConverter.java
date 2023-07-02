import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        String input_value = scanner.nextLine();
        double cashValue;

        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        if (cashValue < 0) {
            System.out.println("Cannot convert negative numbers... Exiting.");
            return;
        }


            System.out.println("converting $" + input_value + " to miles");
        //this line was a var
        RewardValue rewardsValue = new RewardValue(cashValue);
        rewardsValue.getConversionToMiles();
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}