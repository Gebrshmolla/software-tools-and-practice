package Allproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeRecordCRUD {

    private static Map<Integer, String> employeeRecords = new HashMap<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Create Employee Record");
            System.out.println("2. Read Employee Record");
            System.out.println("3. Update Employee Record");
            System.out.println("4. Delete Employee Record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    createEmployeeRecord(scanner);
                    break;
                case 2:
                    readEmployeeRecord(scanner);
                    break;
                case 3:
                    updateEmployeeRecord(scanner);
                    break;
                case 4:
                    deleteEmployeeRecord(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    public static void createEmployeeRecord(Scanner scanner) {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        employeeRecords.put(nextId, name);
        System.out.println("Employee record created with ID: " + nextId);
        nextId++;
    }

    public static void readEmployeeRecord(Scanner scanner) {
        System.out.print("Enter employee ID to read: ");
        int id = scanner.nextInt();
        String name = employeeRecords.get(id);
        if (name != null) {
            System.out.println("Employee " + id + ": " + name);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    public static void updateEmployeeRecord(Scanner scanner) {
        System.out.print("Enter employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String name = employeeRecords.get(id);
        if (name != null) {
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();
            employeeRecords.put(id, newName);
            System.out.println("Employee record updated successfully.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    public static void deleteEmployeeRecord(Scanner scanner) {
        System.out.print("Enter employee ID to delete: ");
        int id = scanner.nextInt();
        String name = employeeRecords.remove(id);
        if (name != null) {
            System.out.println("Employee record deleted successfully.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }
}
