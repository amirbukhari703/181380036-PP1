public class HourlyEmployee extends Employee {
    private double hours, hourlyRate;

    HourlyEmployee(double hours, double hourlyRate, int empId, String name, double taxRate){
        super(empId,name,taxRate);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public void setHours(double hours){
        this.hours = hours;
    }
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    public double getHours(){
        this.hours = hours;
    }
    public double getHourlyRate(){
        this.hourlyRate = hourlyRate;
    }

    public String toString(){
        return "Your Hours = " +getHours() + "/nYour HourlyRate = "+ getHourlyRate();
    }
    public double calculateSalary(){
       double grossPay = hours * hourlyRate;
       double tax = grossPayPay * taxRate;
       double salary = grossPayPay – tax;
    }
}