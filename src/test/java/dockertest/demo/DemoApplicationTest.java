package dockertest.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoApplicationTest {
    @Test
    public void sum(){
        Assertions.assertEquals(3, 1+2);
    }

}