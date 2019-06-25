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

    /**
     * BasicErrorController
     *
     * @Controller
     * @RequestMapping({"${server.error.path:${error.path:/error}}"})
     *      => (1) server.error.path 프로퍼티즈가 있으면 사용, 없으면 (2) 사용.
     *      => (2) error.path 프로퍼티즈가 있으면 사용, 없으면 '/error' 사용.
     *          (현재 새로 정의한 프로퍼티즈가 없으므로 '/error' 사용.
     * public class BasicErrorController extends AbstractErrorController {
     * }
     *
     *
     * BasicErrorController 는 ErrorController 를 구현한 것.
     * 새로 만들 경우 ErrorController를 구현하여 만들면 BasicErrorController 대신 동작.
     * BasicErrorController를 상속받아서 구현하는 것을 권장.
     *
     */


    /**
     * 커스텀 에러 페이지
     * ● 상태 코드 값에 따라 에러 페이지 보여주기
     * ● /src/main/resources/static/error/
     *      또는 /src/main/resources/template/error/
     * ● 404.html
     * ● 5xx.html
     *          => 위에서 만든 커스텀 에러 페이지에 걸리지 않으면
     *              BasicErrorController 가 처리해서 디폴 에러 페이지가 나오게 됨.
     *
     */

    /**
     * 동적인 커스텀 에러 페이지
     * ● ErrorViewResolver 구현 (implements ErrorViewResolver)
     *  서버단에서 특정 에러 처리가 동작하게 하거나,
     *  model에 에러 정보를 담아서 동적으로 에러 페이지를 보여줄 수 있음.
     *
     */
}
