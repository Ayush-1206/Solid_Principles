package SingleResponsibilityPrinciple;

class EmployeeMonsterClass {
    private int id;
    private String name;
    private String address;

    EmployeeMonsterClass(int id, String name, String address){
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
    public void updateEmployeeData(){
        //code to update employee
        System.out.println("Employee data updated");
    }
    public void fetchEmployeeData(){
        //code to show employee details
        System.out.println(name + " - " + id + " - " + address);
    }
}
