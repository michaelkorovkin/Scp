package model;

import enteties.Result;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

/**
 * Springboot main functional class
 */
@SpringBootApplication
public class MainClass {

    /**
     * Result value
     */
    private Result result = new Result();

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
    public void execute(List<Integer> list) {
        result.createResultList(list);
    }
    public static void main (String... args) {
        SpringApplication.run(MainClass.class, args);
    }
}
