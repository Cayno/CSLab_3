public class Employee { // simple class to organize and return 3 common attributes among all employees
    private final String firstName;                      
    private final String lastName;                               
    private final String socialSecurityNumber;  
    
    public Employee(String firstName, String lastName, 
    String socialSecurityNumber) { // 3 arg constructor

        this.firstName = firstName;                                    
        this.lastName = lastName;                                    
        this.socialSecurityNumber = socialSecurityNumber; 
    }

    public String getFirstName() {return firstName;} // return first name
    public String getLastName() {return lastName;} // return last name
    public String getSocialSecurityNumber() {return socialSecurityNumber;} // return SSN
}


