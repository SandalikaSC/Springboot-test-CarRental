package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ctrl3")
public class SpringController3 {
//    path variables
//    how to get the value of a path segment

    @GetMapping(path = "/{c1}/{c2}")
    public String getMethod1(@PathVariable("c1") String cd1,@PathVariable String c2) {
        return "GET METHOD ONE " + cd1 + " " + c2;
    }


    @GetMapping
    public String getMethod2() {
        return "GET METHOD TWO";
    }

}
