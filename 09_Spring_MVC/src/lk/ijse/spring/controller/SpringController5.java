package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/ctrl5")
public class SpringController5 {

//    how to narrow-down a request using
//    parameters


    @GetMapping(params = {"id","name"})
    public String method1() {
        return "Method 1";
    }


    @GetMapping(params = "sort=asc")
    public String method2() {
        return "ASC called";
    }


    @GetMapping(params = "sort=dsc")
    public String method3() {
        return "DSC called";
    }



}
