public class SalariedEmployee extends Employee {
    private double salary;

    SalariedEmployee(double salary, int empId, String name, double taxRate){
        super(empId,name,taxRate);
        this.salary = salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        this.salary = salary;
    }
    public String toString(){
        return "Your Salary is = " + getSalary() + "and your calculated salary is "+ calculateSalary();
    }
    public double calculateSalary(){
        double empSalary = salary – (salary * getTaxRate());
    }
}