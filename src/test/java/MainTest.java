import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2
public class MainTest {

    @Test
    void test_Add() {
        log.info("hello test");
        assertEquals(5, 5);
    }
}
