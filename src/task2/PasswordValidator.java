package task2;

public class PasswordValidator implements Validator {
    private final Validator validatorFirst;
    private final Validator validatorTwo;

    public PasswordValidator(Validator validatorFirst, Validator validatorTwo) {
        this.validatorFirst = validatorFirst;
        this.validatorTwo = validatorTwo;
    }

    @Override
    public boolean isValid(String text) {
        if (validatorFirst.isValid(text)){
            return validatorTwo.isValid(text);
        }
        else throw new IllegalArgumentException("Wrong password");
    }
}
