package bank;

public class Account {
    int SSN; // default - accessible everywhere, but only in the same package
    public String name; // public - accessible everywhere
    protected String email; // protected - accessible everywhere in same package, but only inside subclasses for other package
    private String password; // private - only accessible inside class

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String pass) {
        this.password = pass;
    }
}

// public class Bank {
//     public static void main(String[] args) {
//         Account account1 = new Account();
//         account1.name = "Aniket";
//         account1.email = "aniket@gmail.com";
//         account1.setPassword("jwfdh3");
//         System.out.println(account1.getPassword());
//     }
// }
