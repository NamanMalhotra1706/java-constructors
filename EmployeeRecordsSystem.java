// Employee class
class Employee {
    public int employeeID;             
    protected String department;       
    private double salary;    

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    //  et/update salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("Salary updated to: Rs" + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // get the salary
    public double getSalary() {
        return salary;
    }

    // display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String teamName;

  
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }


    public void displayManagerDetails() {
        System.out.println("\nManager Details:");
        System.out.println("Employee ID: " + employeeID);         
        System.out.println("Department: " + department);         
        System.out.println("Team Name: " + teamName);
        System.out.println("Salary: Rs." + getSalary());
    }
}


public class EmployeeRecordsSystem {
    public static void main(String[] args) {
       
        Employee emp1 = new Employee(101, "IT", 5000.0);
        System.out.println("Initial Employee Details:");
        emp1.displayEmployeeDetails();

     
        emp1.setSalary(5500.0);
        System.out.println("Updated Salary: Rs." + emp1.getSalary());

        Manager manager1 = new Manager(102, "HR", 8000.0, "Recruitment");
        manager1.displayManagerDetails();


        manager1.setSalary(8500.0);
        manager1.displayManagerDetails();
    }
}
