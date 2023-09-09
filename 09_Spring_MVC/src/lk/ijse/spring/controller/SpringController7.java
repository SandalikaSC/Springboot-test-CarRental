package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ctrl7")
public class SpringController7 {

    @GetMapping(params = {"id", "name", "address", "salary"})
    public String method1(@ModelAttribute CustomerDTO dto) {
        return dto.toString();
    }

//    @PostMapping// x-www-form-urlencoded // query string
//    public String method2(String id, String name, String address, String salary) {
//        return "" + id + " " + name + " " + address + " " + salary;
//    }

    @PostMapping// x-www-form-urlencoded // query string
    public String method2(CustomerDTO dto) {
        return dto.toString();
    }


}
