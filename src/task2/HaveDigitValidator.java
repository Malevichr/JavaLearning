package task2;

public class HaveDigitValidator extends NotNullValidator{
    @Override
    public boolean isValid(String text) {
        super.isValid(text);
        if (haveDigit(text)){
            return true;
        }else
            throw new IllegalArgumentException("No digits");
    }
    public boolean haveDigit(String text){
        for(char ch : text.toCharArray()){
            if ((ch > '0') && (ch < '9'))
                return true;
        }
        return false;
    }
}
