package Single_Responsibility_SRP;


class EmployeePerformanceGenerator {
    public void printPerformanceReport(Employee E){
        //code to calculate performance
        System.out.println("Performance report of Employee - " + E.getName());
    }
}
