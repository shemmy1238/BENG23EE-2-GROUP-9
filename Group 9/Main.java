import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nSelect an option:");
            System.out.println("1: Student");
            System.out.println("2: Program");
            System.out.println("3: Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n Enter Student Details ");
                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter Student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter Student Grade: ");
                    String studentGrade = scanner.nextLine();

                    // Display the entered information
                    System.out.println("\n Student Information ");
                    System.out.println("Name: " + studentName);
                    System.out.println("ID: " + studentId);
                    System.out.println("Grade: " + studentGrade);
                    break;

                case 2:
                    System.out.println("\n Enter Program Details ");
                    System.out.print("Enter Program Name: ");
                    String programName = scanner.nextLine();
                    System.out.print("Enter Program Duration : ");
                    String programDuration = scanner.nextLine();
                    System.out.print("Enter Program Type : ");
                    String programType = scanner.nextLine();

                    // Display the entered information
                    System.out.println("\n Program Information ");
                    System.out.println("Name: " + programName);
                    System.out.println("Duration: " + programDuration);
                    System.out.println("Type: " + programType);
                    break;

                case 3:
                    System.out.println("Exiting the program ");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1, 2, or 3.");
                    break;
            }
        }

        scanner.close();
    }
}