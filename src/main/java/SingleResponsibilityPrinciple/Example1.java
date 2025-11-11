package SingleResponsibilityPrinciple;

class EmployMaster{
    private int id;
    private String name;
    private String address;

    EmployMaster(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void printPerformanceReport(){
        //code to calculate performance
        System.out.println("Performance report of Employee" + name);
    }
    public double computeSalary(){
        //code to compute salary
        return 1000.00;
    }
    public void updateEmployData(){
        //code to update employee
        System.out.println("Employee data updated");
    }
    public void fetchEmployData(){
        //code to show employee details
        System.out.println(name + " - " + id + " - " + address);
    }
}

//The EmployeeMaster class is doing too many things,
//there are too many reasons to update the code present iin the class
//This violets SRP


class Employ{
    private int id;
    private String name;
    private String address;

    Employ(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    //Getters and Setters
    public String getName(){
        return this.name;
    }

    public void updateEmployData(){
        //code to update employee
        System.out.println("Employee data updated");
    }
    public void fetchEmployData(){
        //code to show employee details
        System.out.println("Employee details -: " + name + " - " + id + " - " + address);
    }
}

class EmployPerformanceGenerator{
    public void printPerformanceReport(Employ E){
        //code to calculate performance
        System.out.println("Performance report of Employee - " + E.getName());
    }
}

class EmploySalaryCalculator{
    public double computeSalary(Employ E){
        //code to compute salary
        System.out.println(E.getName() + " 10000.00");
        return 1000.00;
    }
}

public class Example1 {

    public static void main(String[] args){
        System.out.println("Hello and welcome!");
        Employ E = new Employ(1, "Ayush", "Bhopal");
        E.fetchEmployData();

        EmployPerformanceGenerator performance = new EmployPerformanceGenerator();
        EmploySalaryCalculator salary = new EmploySalaryCalculator();

        performance.printPerformanceReport(E);
        salary.computeSalary(E);
    }
}
