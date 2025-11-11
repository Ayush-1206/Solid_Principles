package SingleResponsibilityPrinciple;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello and welcome! starting execution");
        Employee E = new Employee(2, "Vikalp", "Bhopal");
        E.fetchEmployeeData();

        EmployeePerformanceGenerator performance = new EmployeePerformanceGenerator();
        EmployeeSalaryCalculator salary = new EmployeeSalaryCalculator();

        performance.printPerformanceReport(E);
        salary.computeSalary(E);
    }

}
