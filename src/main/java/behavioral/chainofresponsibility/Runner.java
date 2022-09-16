package behavioral.chainofresponsibility;

public class Runner {

    public static void main(String[] args) {
        Handler<String> threeDots1 = new HandlerAppendA();
        Handler<String> threeDots2 = new HandlerAppendA();
        Handler<String> toUpper = new HandlerAppendB();

        threeDots1.setNextHandler(threeDots2);
        threeDots2.setNextHandler(toUpper);

        System.out.println(threeDots1.handle("..."));


    }
}
