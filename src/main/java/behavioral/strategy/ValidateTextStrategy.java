package behavioral.strategy;


public interface ValidateTextStrategy {
    boolean doValidation(String input);
}

class IsNumeric implements ValidateTextStrategy {
    @Override
    public boolean doValidation(String input) {
        return input.matches("\\d+");
    }
}

class IsUpperCase implements ValidateTextStrategy {
    @Override
    public boolean doValidation(String input) {
        return input.matches("[A-Z]+");
    }
}
