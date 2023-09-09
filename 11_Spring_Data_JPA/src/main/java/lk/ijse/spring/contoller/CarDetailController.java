package lk.ijse.spring.contoller;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.carDTO;
import lk.ijse.spring.service.CarService;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cardetail")
@CrossOrigin
public class CarDetailController {

    @Autowired
    CarService carService;


    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addCar(@RequestBody carDTO dto) {
        carService.saveCar(dto);
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }



    @DeleteMapping(params = {"regid"})
    public ResponseEntity deleteCar(@RequestParam String regid) {
        carService.deleteCar(regid);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateCar(@RequestBody carDTO dto) {
        carService.updateCar(dto);
        return new ResponseEntity(new StandradResponse(200, "Success", null), HttpStatus.OK);
    }

    @GetMapping(path = "/{regid}")
    public ResponseEntity searchCar(@PathVariable String regid) {
        carDTO carDTO = carService.searchCar(regid);
        return new ResponseEntity(new StandradResponse(200, "Success", carDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllCar() {

        List<carDTO> allcar = carService.getAllCar();
        System.out.println(allcar.get(0).getStatus());
        return new ResponseEntity(new StandradResponse(200, "Success", allcar), HttpStatus.OK);
    }


}
