package com.example.jimin.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //컨트롤러를 JSON을 반환하는 컨트롤러로
public class HelloController {

    @GetMapping("/hello") //HTTP Method Get요청 받을 수 있는 API 생성, /hello로 요청이 오면 문자열 hello 반환
    public String hello(){
        return "hello";
    }

}
