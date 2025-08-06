//Employee payroll system
class Employee{
 String name;
 String id;
 
 Employee(String name, String id){
  this.name = name;
  this.id = id;
 }
 double calculateSalary(){
 return 0;
 }
 void displayInfo(){
  System.out.println("Employee: "+name + "\nId: "+id);
 }
}

class FullTimeEmployee extends Employee{
 double monthlySalary;
 
 FullTimeEmployee(String name, String id, double monthlySalary){
  super(name, id);
  this.monthlySalary = monthlySalary;
 }
 
 @Override
 double calculateSalary(){
  return monthlySalary;
 }
 
 @Override
 void displayInfo(){
  super.displayInfo();
  System.out.println("\nFull Time Employee \nMonthly Salary: "+monthlySalary);
 }
}

class PartTimeEmployee extends Employee{
 double hourlyWage;
 int hoursWorked;
 
 PartTimeEmployee(String name, String id, double hourlyWage, int hoursWorked){
  super(name, id);
  this.hourlyWage = hourlyWage;
  this.hoursWorked = hoursWorked;
 }
 
 @Override
 double calculateSalary(){
  return hourlyWage * hoursWorked;
 }
 
 @Override
 void displayInfo(){
  super.displayInfo();
  System.out.println("\nPart Time Employee\nHourly Wdge : "+hourlyWage +"\nHours Worked : " + hoursWorked);
  }
}

public class EmployeePayrollSystem{
 public static void main(String[] args){
  Employee em1 = new FullTimeEmployee("Eva","241-15-182", 5000.0);
  Employee em2 = new PartTimeEmployee("Anika","241-15-726",24.0, 80);

  em1.displayInfo();
  System.out.println("Salary: " +em1.calculateSalary());
  em2.displayInfo();
  System.out.println("Salary: "+em2.calculateSalary());
 }
}
