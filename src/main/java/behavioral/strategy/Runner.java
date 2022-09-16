package behavioral.strategy;

import lombok.var;

public class Runner {
    public static void main(String[] args) {
        Context ct = new Context();
        ct.setValidateStrategy(new IsUpperCase());
        var x1 = ct.execStrategy("aa");

        ValidateTextStrategy numericValidator =
                (input) -> input.matches("\\d+");

        numericValidator.doValidation("fn");
    }
}
