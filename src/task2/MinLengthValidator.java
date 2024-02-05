package task2;

public class MinLengthValidator implements Validator{
    private final int minLength;

    public MinLengthValidator(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean isValid(String text) {
        if(text.length() >= minLength)
            return true;
        else
            throw new IllegalArgumentException("Text length < minLength");
    }
}
