class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String msg) { super(msg); }
}
class Auth {
    public void validate(String user, String pass) throws InvalidCredentialsException {
        if(!user.equals("admin") || !pass.equals("1234"))
            throw new InvalidCredentialsException("Invalid credentials!");
    }
}
public class Main {
    public static void main(String[] args) {
        Auth auth = new Auth();
        try {
            auth.validate("admin", "abcd");
        } catch(InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}
