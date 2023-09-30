package bank;
class Account {
    public String name;
    protected String email;
    private String password;

    //getters and setters
    public String getPassword(){
        return this.password;
    }
    public String setPassword(String pass){
        this.password = pass;
        return this.password;
    }
}
public class Bank {
    public static void main(String args[]){
    Account account1 = new Account();
    account1.name="Apna clg";
    account1.email="apna@gmail.com";
    account1.setPassword("abcd");
    System.out.println(account1.getPassword());
    }
}
