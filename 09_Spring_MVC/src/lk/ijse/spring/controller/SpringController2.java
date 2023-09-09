package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ctrl2")
public class SpringController2 {

//    01 -request narrow downing
//    *path - path segments

    @GetMapping(path = "/m1")
    public String getMethod1() {
        return "GET Mapping One";
    }

    @GetMapping(path = "/m1/one")
    public String getMethod2() {
        return "GET Mapping Two";
    }

    @GetMapping
    public String getMethod3() {
        return "GET Mapping Default";
    }


}
