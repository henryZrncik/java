package behavioral.chainofresponsibility;

public interface Handler<T> {

    T handle(T request);
    T handleWork(T request);
    void setNextHandler(Handler<T> h);
}

abstract class BaseHandler implements Handler<String> {

    Handler<String> nextHandler;

    public abstract String handleWork(String request);

    @Override
    public String handle(String request) {
        System.out.println("handling");
        String result = this.handleWork(request);

        if (this.nextHandler != null){
            System.out.println("sending to next handler");
            return this.nextHandler.handle(result);
        }
        return result;
    }

    @Override
    public void setNextHandler(Handler<String> h) {
        this.nextHandler = h;
    }
}

class HandlerAppendB extends BaseHandler{
    @Override
    public String handleWork(String request) {
        return request.concat("B");
    }
}

class HandlerAppendA extends BaseHandler{
    @Override
    public String handleWork(String request) {
        return request.concat("A");
    }
}