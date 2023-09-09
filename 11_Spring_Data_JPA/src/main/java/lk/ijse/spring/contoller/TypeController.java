package lk.ijse.spring.contoller;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.TypeDTO;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.service.TypeService;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/type")
@CrossOrigin
public class TypeController {

    @Autowired
    TypeService typeService;

    @GetMapping(path = "/{tid}")
    public ResponseEntity searchType(@PathVariable String tid) {
        TypeDTO typedto = typeService.searchType(tid);
        return new ResponseEntity(new StandradResponse(200, "Success", typedto), HttpStatus.OK);
    }

}
