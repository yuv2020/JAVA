package oops.bank;

// Bank class with main method to demonstrate inheritance and polymorphism.
//Use of packages

class Account{
    public String name;
    protected String email;
    private String password;

    //getter & setter

    public String getpassword() {
        return this.password;
    }

    public void setpassword(String pass) {
        this.password = pass;
    }
}



public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "John Doe";
        account.email= "John@doe.com";
        account.setpassword("password123");
        System.out.println("Name: " + account.name);
        System.out.println("Email: " + account.email);
        System.out.println("Password: " + account.getpassword());
        
    }
    
}
