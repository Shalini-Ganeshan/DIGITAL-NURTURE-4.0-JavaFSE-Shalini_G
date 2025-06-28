package test.java.com.example;

import com.example.demo.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    @Test
    void testAdd() {
        CalculatorService service = new CalculatorService();
        assertEquals(5, service.add(2, 3));
    }
}
