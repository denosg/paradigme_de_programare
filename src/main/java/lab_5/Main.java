package lab_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        System.out.println();
        final int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.print("nume: ");
            final String employeeName = scanner.nextLine();
            System.out.print("email: ");
            final String employeeEmail = scanner.nextLine();
            System.out.print("hourRate: ");
            final double employeeHourRate = scanner.nextDouble();
            System.out.print("capacity: ");
            final int employeeCapacity = scanner.nextInt();
            System.out.print("freeDays: ");
            final int employeeFreeDays = scanner.nextInt();
            Employee newEmployee = new Employee(employeeName, employeeEmail, employeeHourRate, employeeCapacity, employeeFreeDays);
            employeeList.add(newEmployee);
        }
        for (Employee e : employeeList) {
            final double employeeIncome = e.getMonthlyIncome();
            final double dailyIncome = e.getDailyIncome();
            System.out.println("Income: "+employeeIncome +" for: "+e.getName());
            System.out.println("Daily income: "+dailyIncome);
        }
    }
}
