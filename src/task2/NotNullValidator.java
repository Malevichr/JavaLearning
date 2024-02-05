package task2;

public class NotNullValidator extends MinLengthValidator{
    public NotNullValidator() {
        super(1);
    }

    @Override
    public boolean isValid(String text) {
        try {
            super.isValid(text);
        }
        catch (Exception e){
            throw new IllegalArgumentException("Empty text");
        }
        return true;
    }
}
