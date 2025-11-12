package Single_Responsibility_SRP;

class Employee {
    private int id;
    private String name;
    private String address;

    Employee(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    //Getters and Setters
    public String getName(){
        return this.name;
    }

    public void updateEmployeeData(){
        //code to update employee
        System.out.println("Employee data updated");
    }
    public void fetchEmployeeData(){
        //code to show employee details
        System.out.println("Employee details -: " + name + " - " + id + " - " + address);
    }

}
