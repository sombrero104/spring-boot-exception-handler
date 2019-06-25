package sombrero;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 전역 에러 핸들러
 */
@ControllerAdvice
public class SampleErrorHandler {

    @ExceptionHandler(SampleException.class)
    public @ResponseBody
    AppError sampleError(SampleException e) {
        AppError appError = new AppError();
        appError.setMessage("error.app.key2");
        appError.setReason("let me tell u..");
        return appError;
    }

}
