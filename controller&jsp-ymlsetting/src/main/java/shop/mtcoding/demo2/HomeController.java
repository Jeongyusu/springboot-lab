package shop.mtcoding.demo2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//1.@Controller가 붙으면 new해서 객체 생성됨. 컴퍼넌트 스캔 이후 IOC(제어의역전)컨테이너에 HomeController가 등록됨.
//2.home() 요청 - localhost:8080/home -> /home 파싱.
//3.IOC컨테이너에서 /home으로 등록된 깃발 찾기
//4.호출(invoke)
//5.home()응답
//@Controller분석 : 리턴값을 파일로 인식(뷰리졸버 동작)
//@RestController분석 : 리턴값을 데이터로 인식(메시지컨버터 동작)
@Controller
public class HomeController {


    @GetMapping("/home")
    public String home(){
        return "home"; //ViewResolver 클래스 발동 : webapp/WEB-INF/views/home.jsp (yml파일에서 설정)
    }


}
