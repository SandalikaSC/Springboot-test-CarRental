package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.RegisterDTO;
import lk.ijse.spring.entity.Register;
import lk.ijse.spring.repo.RegistrationRepo;
import lk.ijse.spring.service.RegistrationService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService {


    @Autowired
    RegistrationRepo repo;

    @Autowired
    ModelMapper mapper;




    @Override
    public RegisterDTO searchRegister(String id) {
        Optional<Register> register = repo.findById(id);
        if (register.isPresent()) {
            return mapper.map(register.get(), RegisterDTO.class);
        } else {
            throw new RuntimeException("No Registration for id: " + id);
        }
    }



    @Override
    public List<RegisterDTO> getAllRegisters() {
        List<Register> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<RegisterDTO>>() {
        }.getType());
    }

}
