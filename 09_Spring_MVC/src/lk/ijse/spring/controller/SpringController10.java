package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ctrl10")
public class SpringController10 {

    @GetMapping(headers = {"Content-Type=application/json","Accept=application/json"})
    public String test() {
        return "Working";
    }
}
