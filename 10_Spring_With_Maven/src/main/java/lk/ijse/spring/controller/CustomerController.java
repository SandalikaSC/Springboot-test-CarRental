package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @GetMapping
    public CustomerDTO addCustomer() {
        return new CustomerDTO("C001", "Dasun", "Galle", 1000);
    }
}
