package model.ws;

import enteties.Result;
import exceptions.MainException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;

/**
 * Web-service rest-controller
 */

@RestController()
public class MainRestController {
    private Result result = new Result();

    /**
     * Count prime numers from input reaiest
     * @param input - arrays of numbers
     * @return - array of result
     */
    @PostMapping("/scp/test")
    public Result testMethod (@RequestBody Integer[] input) throws MainException{
        result = new Result();
        result.createResultList(Arrays.asList(input));
        return result;
    }

}
