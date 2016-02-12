package week06.Friday;

public class BankAccount {

    public String firstName;
    public String lastName;
    public int age;
    public int id;
    
    public double balance;
    public double interest;
    public String typeOfInterest;
    
    public BankAccount(String firstName, String lastName, int age, double balance, double interest, String typeOfInterest){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.balance = balance;
        this.interest = interest;
        this.typeOfInterest = typeOfInterest;
        
        id = this.hashCode();
    }
    
    public BankAccount(){}
    
    
    public int hashCode() {
        int hash = 9;
        hash = hash * 21 + firstName.hashCode();
        hash = hash * 21 + lastName.hashCode();
        return hash;
    }
  
}
