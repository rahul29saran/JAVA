import java.util.Scanner;

class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the values
        System.out.print("Enter Basic Salary (bs): ");
        int bs = scanner.nextInt();

        System.out.print("Enter Travel Allowance (ta): ");
        int ta = scanner.nextInt();

        System.out.print("Enter Dearness Allowance (da): ");
        int da = scanner.nextInt();

        System.out.print("Enter House Rent Allowance (hra): ");
        int hra = scanner.nextInt();

        // Calculating the total salary
        int ts = bs + ta + da + hra;

        // Displaying the total salary
        System.out.println("Total Salary (ts): " + ts);
        
        scanner.close(); // Close the scanner after use
    }
}
