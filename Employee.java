public abstract Employee{
    private int empId;
    private String name;
    private double taxRate;

    Employee(){
        empId = 12;
        name = Ahmed;
        taxRate = 33.3;
    }
        //3 arg overloaded constructor
        Employee(int empId, String name, double taxRate){
        this.empId = empId;
        this.name = name;
        this.taxRate = taxRate;
    }

    //setter getter
        public void setEmpId(int empId){
            this.empId = empId;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setTaxRate(double taxRate){
            this.taxRate =taxRate;
        }
        public int getEmpId(){
            this.empId = empId;
        }
        public String getName(){
            this.name = name
        }
        public double getTaxRate(){
            this.taxRate = taxRate;
        }

        public abstract double calculateSalary();
        public String toString(){
            return "YOur Id is = " + getId() + "/nYOur Name is = " + getName() + "/nTax Rate is = " +getTaxRate();
        }



}