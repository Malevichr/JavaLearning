import task1.Triangle;
import task1.TriangleFactory;
import task2.MinLengthValidator;
import task2.NotNullValidator;
import task2.PasswordValidator;
import task2.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new NotNullValidator();
        System.out.println(validator.isValid(""));
    }
}