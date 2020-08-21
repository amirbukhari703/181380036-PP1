package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee[] emp = new Employee[6];
        emp[0] = new SalariedEmployee(23000,12,"John",333);
        emp[1] = new SalariedEmployee(1300,11,"Doe",213);
        emp[2] = new HourlyEmployee(12,500.0,1,"Asim",11);
        emp[3] = new HourlyEmployee(3,400,2,"JohnyIpsum",3);
        emp[4] = new CommissionEmployee(333,12,2,"John",24);
        emp[5] = new CommissionEmployee(22,12,4,"Divi",16);

        for (int i=0; i < 6;i++){
            System.out.println(emp[i].toString());
        }

    }
}
