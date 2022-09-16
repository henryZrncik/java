package behavioral.observer;

import lombok.extern.log4j.Log4j2;

public interface Observer {
    void react(String news);
}

@Log4j2
class ConcreteObserver1 implements Observer{
    @Override
    public void react(String news) {
        log.info("Observer1: {}", news);
    }
}

@Log4j2
class ConcreteObserver2 implements Observer{
    @Override
    public void react(String news) {
        log.info("Observer2: {}", news);
    }
}
