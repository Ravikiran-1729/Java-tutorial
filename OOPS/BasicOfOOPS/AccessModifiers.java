class Account {
    public String name;
    protected String email;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public void getPassword(){
        System.out.println("Password is :- "+this.password+"\n");
    }

    public void getInfo(){
        System.out.println("Name :- "+name);
        System.out.println("Email :- "+email);
    }
}

public class AccessModifiers {
    public static void main(String args[]) {
        Account a1 = new Account();

        a1.name = "Ravikiran";
        a1.email = "hiiamravi.com";

        //SET & ACCESS PRIVATE VARIABLE VIA METHODS
        a1.setPassword("abcd");
        a1.getPassword();


        a1.getInfo();
    }
}
