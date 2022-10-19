package dockertest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSOutput;

import java.util.function.DoubleToIntFunction;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("test");
        SpringApplication.run(DemoApplication.class, args);
    }

}
