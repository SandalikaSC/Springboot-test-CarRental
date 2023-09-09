package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.UserDto;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.User;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.UserRepo;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepo repo;

    @Autowired
    ModelMapper mapper;


    @Override
    public void saveUser(UserDto dto) {
        if (!repo.existsById(dto.getUsername())) {
            User c = mapper.map(dto, User.class);
            repo.save(c);
        } else {
            throw new RuntimeException("use different User Name");
        }
    }

    @Override
    public UserDto searchUser(String username) {
        Optional<User> user = repo.findById(username);
        if (user.isPresent()) {
            return mapper.map(user.get(), UserDto.class);
        } else {
            throw new RuntimeException("No user for username: " + username);
        }
    }
}
