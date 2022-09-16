package behavioral.chainofresponsibility;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaRunner {


    public static void main(String[] args) {
        Function<String,String> handlerAppendA = (String in) -> in.concat("A");
        Function<String,String> handlerAppendB = (String in) -> in.concat("B");

        // chain of responsibility
        Function<String, String> handlersChained =
        handlerAppendA
                .andThen(handlerAppendA)
                .andThen(handlerAppendB);

        // apply pipeline
        System.out.println(handlersChained.apply("..."));
    }


}
