package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ctrl11")
public class SpringController11 {

    @GetMapping
    public CustomerDTO testCustomerJson1() {
        return new CustomerDTO("C001", "Dasun", "Galle", 1000);
    }


    @PostMapping
    public String testCustomerJson2(@RequestBody CustomerDTO dto) {
        return dto.toString();
    }
}
