package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.RegisterDTO;

import java.util.List;


public interface RegistrationService {

    RegisterDTO searchRegister(String id);

    List<RegisterDTO> getAllRegisters();
}
