package src.OopsNotes;

public class Private_Modifiers {

    private String username;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String uname) {
        this.username = uname;
    }


    private String password;


    public Private_Modifiers(String uname, String pword) {

        this.username = uname;
        this.password = pword;
    }

    public void Display() {

        System.out.println("Credentials");
        System.out.println("The user name is " + this.username);
        System.out.println("The password is " + this.password);
    }

}
