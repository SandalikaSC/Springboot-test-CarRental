package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ctrl8")
public class SpringController8 {

//    headers
//    content-type

//    @GetMapping(consumes = {"application/json"})
    @GetMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String methodOne() {
        return "Type JSON";
    }

    @GetMapping(consumes = {MediaType.TEXT_PLAIN_VALUE})
    public String methodTwo() {
        return "Plain Text";
    }
}
