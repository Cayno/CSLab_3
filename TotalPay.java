public class TotalPay { // class that adds employee commission pay and standard base pay
    private CommissionPay employeeTotal; // composition...
    private double baseSalary; // base salary per week

    public TotalPay(String firstName, String lastName, String socialSecurityNumber, 
        double grossSales, double commissionRate, double baseSalary) { // new 6 argument constructor

        if (baseSalary < 0.0) { // if baseSalary is invalid throw exception
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        employeeTotal = new CommissionPay(firstName, lastName, socialSecurityNumber, 
            grossSales, commissionRate); // composition... or something. I put this here and it fixed everything but I don't understand why!

     this.baseSalary = baseSalary;
    }

    // set methods
    public void setGrossSales(double grossSales) { // set commission employee's gross sales amount
        employeeTotal.setGrossSales(grossSales);
    } 

    public void setCommissionRate(double commissionRate) { // set commission employee's rate
        employeeTotal.setCommissionRate(commissionRate);
    } 

    public void setBaseSalary(double baseSalary) { // set base salary
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    // get methods
    public double getBaseSalary() {return baseSalary;} // return base-salaried commission employee's base salary
    public double earnings() {return getBaseSalary() + employeeTotal.earnings();} // calculate and return base-salaried commission employee's earnings

    public String toString() { // return string representation of total pay
        CommissionPay commPay = new CommissionPay(employeeTotal.getFirstName(), employeeTotal.getLastName(),
            employeeTotal.getSocialSecurityNumber(), employeeTotal.getGrossSales(), employeeTotal.getCommissionRate()); // create CommissionPay object

        return String.format("%s%n %s%.2f%n %s%s", // print method for all values
            commPay.toString(),
            "Base Salary: ", getBaseSalary(),
            "Total Earnings: ", earnings());
    } 

}