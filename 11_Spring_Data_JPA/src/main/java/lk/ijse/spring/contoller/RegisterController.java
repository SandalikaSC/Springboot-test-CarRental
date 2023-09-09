package lk.ijse.spring.contoller;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.RegisterDTO;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.service.RegistrationService;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/registration")
@CrossOrigin
public class RegisterController {

    @Autowired
    RegistrationService registrationService;



    @GetMapping(path = "/{rid}")
    public ResponseEntity searchRegister(@PathVariable String rid) {
        RegisterDTO registerDTO = registrationService.searchRegister(rid);
        return new ResponseEntity(new StandradResponse(200, "Success", registerDTO), HttpStatus.OK);
    }
//
//    @GetMapping
//    public ResponseEntity getAllCustomers() {
//        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
//        return new ResponseEntity(new StandradResponse(200, "Success", allCustomers), HttpStatus.OK);
//    }


}
