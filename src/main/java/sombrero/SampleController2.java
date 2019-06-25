package sombrero;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController2 {

    /**
     *
     *$ curl http://localhost:8080/hello
     * {"message":"error.app.key","reason":"let me think.."}
     *
     * $ curl http://localhost:8080/hello2
     * {"message":"error.app.key2","reason":"let me tell u.."}
     *
     *
     */
    @GetMapping("/hello2")
    public String hello2() {
        throw new SampleException();
    }

}
