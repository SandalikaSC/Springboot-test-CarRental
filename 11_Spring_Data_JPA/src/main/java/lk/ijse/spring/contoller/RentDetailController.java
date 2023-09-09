package lk.ijse.spring.contoller;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.RentDetailDTO;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.service.RentDetailService;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/Rent")
@CrossOrigin
public class RentDetailController {

    @Autowired
    RentDetailService rentDetailService;


    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addRent(@RequestBody RentDetailDTO dto) {
        rentDetailService.saveRent(dto);
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }



//    @DeleteMapping(params = {"id"})
//    public ResponseEntity deleteCustomer(@RequestParam String id) {
//        customerService.deleteCustomer(id);
//        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.CREATED);
//    }
//
    @PutMapping
    public ResponseEntity updateRent(@RequestBody RentDetailDTO dto) {
        rentDetailService.updateRent(dto);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchRent(@PathVariable String id) {
        RentDetailDTO customerDTO = rentDetailService.searchRent(id);
        return new ResponseEntity(new StandradResponse(200, "Success", customerDTO), HttpStatus.OK);
    }
//
//    @GetMapping
//    public ResponseEntity getAllCustomers() {
//        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
//        return new ResponseEntity(new StandradResponse(200, "Success", allCustomers), HttpStatus.OK);
//    }


}
