package src.OopsBase;


public class Login {

    public static void main(String[] args) {

        Log access = new Log("admin", "admin");

        access.isLoggedin("admin", "admin");
    }

    static class Log {
        public String username;
        public String password;

        public Log(String username, String password) {

            this.username = username;
            this.password = password;
        }

        public boolean isLoggedin(String username, String password) {

            if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {

                System.out.println("Logged");
                return true;
            } else {

                System.out.println("Not LOgged");
                return false;
            }

        }
    }
}
