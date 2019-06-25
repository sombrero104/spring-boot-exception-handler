package sombrero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 스프링 부트가 제공하는 기본 예외 처리기
     * ● BasicErrorController (shift 2 times -> BasicErrorController)
     *      ○ HTML과 JSON 응답 지원
     * ● 커스터마이징 방법
     *      ○ ErrorController 구현
     */

    /**
     *
     * 기본적인 에러 핸들러 결과(브라우저 요청 -> html로 응답, curl 요청 -> MachineClient -> JSON으로 응답)
     *
     * $ curl http://localhost:8080/
     * {"timestamp":"2019-06-25T11:11:21.939+0000","status":404,"error":"Not Found","message":"No message available","path":"/"}
     *
     */
}
