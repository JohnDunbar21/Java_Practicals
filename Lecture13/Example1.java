
public class Example1 {

    protected String password;

    public Example1 (String password) {
        this.password = password;
    }

    public static boolean passwordValidation(String password) {
        int passwordLength = password.length();
        int passLength = 16;
        if((password.matches("[a-zA-Z]*[0-9]*")) && (passwordLength >= passLength)) {
            System.out.println("Password is in a valid format.");
            return true;
        }
        else {
            System.out.println("Password is in an invalid format.");
            return false;
        }
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        Example1 example = new Example1(args[0]);

        example.passwordValidation(example.getPassword());
    }
}
