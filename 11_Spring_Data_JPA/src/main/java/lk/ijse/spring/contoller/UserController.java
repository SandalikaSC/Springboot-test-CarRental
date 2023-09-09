package lk.ijse.spring.contoller;

import lk.ijse.spring.dto.UserDto;
import lk.ijse.spring.service.UserService;
import lk.ijse.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addUser(@RequestBody UserDto dto) {
        System.out.println(dto.toString());
        userService.saveUser(dto);
        StandradResponse response = new StandradResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }


        @GetMapping(path = "/{username}")
    public ResponseEntity searchUser(@PathVariable String username) {
            System.out.println(username);
        UserDto userDto = userService.searchUser(username);
        return new ResponseEntity(new StandradResponse(200, "Success", userDto), HttpStatus.OK);
    }

}
