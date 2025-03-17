package application;

import entities.Employee;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Gross Salary");
        double grossSalary = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary);

        TaxService taxService = new TaxService();
        PensionService pensionService = new PensionService();

        SalaryService salaryService = new SalaryService(taxService, pensionService);
        double netSalary = salaryService.netSalary(employee);

        System.out.printf("Net salary: %.2f", netSalary);
        sc.close();
    }
}