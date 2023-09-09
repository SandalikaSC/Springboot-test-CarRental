package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ctrl9")
public class SpringController9 {

//    Request Nattow downing using Headers
//    Accept

    @GetMapping(consumes = {"application/json"}, produces = {"application/json"})
    public String methodOne() {
        return "Method One";
    }

    @GetMapping(consumes = {"application/xml"}, produces = {"application/xml"})
    public String methodTwo() {
        return "Method Two";
    }

}
