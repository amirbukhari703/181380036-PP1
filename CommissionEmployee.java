public class CommissionEmployee extends Employee {
    private double sales,commissionRate;

    CommissionEmployee (double sales, double commissionRate, int empId, String name, double taxRate){
        super(empId,name,taxRate);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public void  setSales(double sales){this.sales=sales;}
    public void setCommissionRate(double commissionRate){this.commissionRate=commissionRate;}
    public double getSales(){this.sales=sales;}
    public double getCommissionRate(){this.commissionRate=commissionRate;}

    public String toString(){
        return "Your sales are = " + getSales() + "/nYour Commission Rate is = "+getCommissionRate();
    }
    public double calculateSalary(){
        double grossPay = sales * commissionRate;
        double tax = grossPayPay * taxRate;
        double empSalary = grossPayPay – tax;
    }
}