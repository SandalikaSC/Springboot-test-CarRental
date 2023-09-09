package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ctrl6")
public class SpringController6 {

    @GetMapping(params = {"id", "name"})
    public String method1(@RequestParam("id") String firstID, @RequestParam("name") String firstName) {
        return "Method 1 " + firstID + " " + firstName;
    }


    @GetMapping(params = "sort=asc")
    public String method2(String sort) {
        return "ASC called " + sort;
    }

}
