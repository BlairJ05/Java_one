import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many miles away is your workplace? ");
        int miles = scanner.nextInt();

        System.out.print("What's the weather today? ");
        String weather = scanner.next();

        // Simple decision: walk if distance is 3 miles or less and it's sunny
        if (miles <= 3 && weather.equalsIgnoreCase("Sunny")) {
            System.out.println("You can walk to work!");
        } else {
            System.out.println("You should drive to work.");
        }

        scanner.close();
    }
}