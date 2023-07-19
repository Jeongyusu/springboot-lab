package shop.metacoding.httpmethodpractice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HttpMethodController {


    @GetMapping("/req/get")
    public void methodGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("요청주소 : " + request.getRemoteAddr());
        System.out.println("요청주소 : " + request.getMethod());
        System.out.println("요청주소 : " + request.getHeader("User-Agent"));
        System.out.println("요청주소 : " + request.getRequestURI());
        System.out.println("쿼리스트링 : " + request.getQueryString());
        System.out.println("name : " + request.getParameter("name"));
        System.out.println("password : " + request.getParameter("password"));




    }

}
