package lk.ijse.spring.contoller;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/driver")
@CrossOrigin
public class DriverController {

    @Autowired
    DriverService driverService;


    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addDriver(@RequestBody DriverDTO dto) {
        driverService.saveDriver(dto);
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
    public ResponseEntity updateDriver(@RequestBody DriverDTO dto) {
        driverService.updateDriver(dto);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }

    @GetMapping(path = "/{did}")
    public ResponseEntity searchDriver(@PathVariable String did) {
        DriverDTO driverDTO = driverService.searchDriver(did);
        return new ResponseEntity(new StandradResponse(200, "Success", driverDTO), HttpStatus.OK);
    }
    @GetMapping(path = "/status")
    public ResponseEntity pickupDriver(@PathVariable String status) {
        DriverDTO driverDTO = driverService.pickupDriver(status);
        return new ResponseEntity(new StandradResponse(200, "Success", driverDTO), HttpStatus.OK);
    }
//
//    @GetMapping
//    public ResponseEntity getAllCustomers() {
//        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
//        return new ResponseEntity(new StandradResponse(200, "Success", allCustomers), HttpStatus.OK);
//    }


}
