package shop.mtcoding.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {

    // http://localhost:8080/ (마지막 /생략가능)
    @GetMapping("/")
    public String home(){
        return "home";
    }

    // http://localhost:8080/hello (마지막 /생략가능)
    @GetMapping("/hello")
    public String hello(){
        return "<h1>hello</h1>";
    }


    @GetMapping("/check")
    public void check(){
        System.out.println("/check 호출됨");

    }

    @GetMapping("/random/number")
    public String number1(){
        Random r = new Random();
        int num = r.nextInt(5);
        return "<h1>" + num + "" +"</h1>";

//        Integer num1 = r.nextInt(5);
//        return num1.toString();

    }



}
