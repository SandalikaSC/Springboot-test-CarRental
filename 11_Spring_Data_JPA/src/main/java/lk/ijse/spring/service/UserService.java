package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.UserDto;

import java.util.List;


public interface UserService {
    void saveUser(UserDto dto);
    UserDto searchUser(String username);
}
