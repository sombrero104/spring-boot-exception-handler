package sombrero;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/hello")
    public String hello() {
        throw new SampleException();
    }

    /**
     * SampleController 안에서만 SampleException 발생 시 아래 핸들러 사용.
     *
     * $ curl http://localhost:8080/hello
     * {"message":"error.app.key","reason":"let me think.."}
     */
    @ExceptionHandler(SampleException.class)
    public @ResponseBody AppError sampleError(SampleException e) {
        AppError appError = new AppError();
        appError.setMessage("error.app.key");
        appError.setReason("let me think..");
        return appError;
    }

}
