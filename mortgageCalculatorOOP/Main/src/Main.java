import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        while (principal < 1_000 || principal > 1_000_000) {
            System.out.println("Enter a value between 1 000 and 1 000 000");
            System.out.print("Principal: ");
            principal = scanner.nextInt();
        }

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        while (annualInterest < 1 || annualInterest > 30) {
            System.out.println("Enter a value between 1 and 30");
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
        }

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        while (years < 1 || years > 30) {
            System.out.println("Enter a value between 1 and 30");
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
        }

        MortgageCalculator calculateMortgage = new MortgageCalculator(principal, annualInterest, years);
        calculateMortgage.runTheProgram();
    }
}
