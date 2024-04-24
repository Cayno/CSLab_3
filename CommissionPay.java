public class CommissionPay extends Employee { // class that adds 2 attributes for employees that receive commission pay type
    private double grossSales; // gross weekly sales       
    private double commissionRate; // commission percentage

    public CommissionPay(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) { // new 5 argument constructor
        super(firstName, lastName, socialSecurityNumber); // carry over constructor from Employee superclass
        
        if (grossSales < 0.0) { // if grossSales is invalid throw exception
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        if (commissionRate <= 0.0 || commissionRate >= 1.0) { // if commissionRate is invalid throw exception
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // set methods
    public void setGrossSales(double grossSales) { // set gross sales amount
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    } 
    
    public void setCommissionRate(double commissionRate) { // set commission rate
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    } 
    
    // get methods
    public double getGrossSales() {return grossSales;} // return gross sales amount
    public double getCommissionRate() {return commissionRate;} // return commission rate
    public double earnings() {return getCommissionRate() * getGrossSales();} // calculate and return earnings

    public String toString() { // return string representation of commission pay
        return String.format("%s%s%s%s%n %s%s%n %s%s%n %s%s", 
        "Name: ", getFirstName(), " ", getLastName(), 
        "SSN: ", getSocialSecurityNumber(), 
        "Gross Sales: ", getGrossSales(), 
        "Commission Rate: ", getCommissionRate());
    }
}
