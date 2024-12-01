package bank2;

class Account{
    public String name;
    protected String email;
    private String password;

    //getters and setters
    public String getpassword() {
        return this.password;
    }

    public void setpassword(String pass) {
        this.password = pass;
    }

}
public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "John Doe";
        account1.email = "John.Doe@gmail.com";
        account1.setpassword("abcdef");
        System.out.println(account1.getpassword());

        System.out.println("Name: " + account1.name);
    }
    
}
