// Base Employee class
class Employee {
    private String name;
    private String employeeID;
    private double salary;

    public Employee(String name, String employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee: " + name + 
                        "\nID: " + employeeID + 
                        "\nSalary: $" + salary);
    }

    // Getters
    public String getName() { return name; }
    public String getEmployeeID() { return employeeID; }
    public double getSalary() { return salary; }
}

// Doctor extends Employee
class Doctor extends Employee {
    private String specialization;
    private String department;

    public Doctor(String name, String id, double salary, 
                 String specialization, String department) {
        super(name, id, salary);
        this.specialization = specialization;
        this.department = department;
    }

    public String diagnose() {
        return "Dr. " + getName() + " is diagnosing in " + department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization +
                        "\nDepartment: " + department);
    }
}

// Surgeon extends Doctor
class Surgeon extends Doctor {
    private int yearsOfExperience;
    private int numberOfSurgeries;

    public Surgeon(String name, String id, double salary, 
                  String specialization, String department,
                  int experience, int surgeries) {
        super(name, id, salary, specialization, department);
        this.yearsOfExperience = experience;
        this.numberOfSurgeries = surgeries;
    }

    public String performSurgery() {
        return "Dr. " + getName() + " is performing surgery!";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Experience: " + yearsOfExperience + " years" +
                        "\nSurgeries performed: " + numberOfSurgeries);
    }
}

// Hospital main class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Doctor drSmith = new Doctor("John Smith", "D100", 120000, 
                                  "Cardiology", "Heart Center");
        Surgeon drLee = new Surgeon("Alice Lee", "S200", 250000, 
                                   "Neurosurgery", "Neurology", 10, 500);

        System.out.println("=== Hospital Staff ===");
        drSmith.displayDetails();
        System.out.println(drSmith.diagnose());
        
        System.out.println("\n");
        
        drLee.displayDetails();
        System.out.println(drLee.diagnose());
        System.out.println(drLee.performSurgery());
    }
}
