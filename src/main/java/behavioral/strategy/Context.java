package behavioral.strategy;


public class Context  {
    private ValidateTextStrategy validateStrategy;

    public void setValidateStrategy(ValidateTextStrategy validateStrategy) {
        this.validateStrategy = validateStrategy;
    }

    public boolean execStrategy(String text){
        return validateStrategy.doValidation(text);
    }
}
