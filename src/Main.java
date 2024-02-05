import task1.Triangle;
import task1.TriangleFactory;
import task2.*;

public class Main {
    public static void main(String[] args) {
        Validator validator = new PasswordValidator(new NotNullValidator(), new MinLengthValidator(5));
        Validator validator1 = new PasswordValidator(validator, new HaveDigitValidator());
        System.out.println(validator1.isValid("aaaaaaa1"));
    }
}