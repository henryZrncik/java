package behavioral.observer;

public class Runner {
    public static void main(String[] args) {
        Subject s = new Subject();
        s.observers.add(new ConcreteObserver2());
        s.observers.add(new ConcreteObserver1());
        s.observers.add((String f) -> System.out.println("lambdas"));
        s.notifyObservers("lol");
    }
}
