import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        int currentYear = 2025;

        // Detect if System.console() is available (terminal) or fallback to Scanner (IDE)
        if (System.console() != null) {
            getInputFromConsole(currentYear);
        } //else {
            //getInputFromScanner(currentYear);
        //}
    }

    // Terminal-friendly method using System.console()
    public static void getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what's your name? ");
        String course = System.console().readLine("Which course are you taking? ");
        String ageStr = System.console().readLine("How old are you? ");
        int age = Integer.parseInt(ageStr);

        System.out.println("\nSummary:");
        System.out.println("Name   : " + name);
        System.out.println("Course : " + course);
        System.out.println("Age    : " + age);
        System.out.println("Year   : " + currentYear);
        System.out.println("Thank you for participating!");
    }

    // IDE-friendly method using Scanner
    public static void getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hi, what's your name? ");
        String name = scanner.nextLine();

        System.out.print("Which course are you taking? ");
        String course = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("\nSummary:");
        System.out.println("Name   : " + name);
        System.out.println("Course : " + course);
        System.out.println("Age    : " + age);
        System.out.println("Year   : " + currentYear);
        System.out.println("Thank you for participating!");
    }
}
