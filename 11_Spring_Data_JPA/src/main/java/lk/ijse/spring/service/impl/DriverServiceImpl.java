package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.repo.DriverRepo;
import lk.ijse.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverRepo repo;
    @Autowired
    ModelMapper mapper;

    @Override
    public void saveDriver(DriverDTO dto) {
        if (!repo.existsById(dto.getDid())) {

            Driver c = mapper.map(dto, Driver.class);

            repo.save(c);

        } else {
            throw new RuntimeException("Driver already exist..!");
        }

    }

    @Override
    public void updateDriver(DriverDTO dto) {
        if (repo.existsById(dto.getDid())) {
            Driver c = mapper.map(dto, Driver.class);
            repo.save(c);
        } else {
            throw new RuntimeException("No such Driver for update..!");
        }
    }

    @Override
    public DriverDTO searchDriver(String id) {
        Optional<Driver> driver = repo.findById(id);
        if (driver.isPresent()) {
            return mapper.map(driver.get(), DriverDTO.class);
        } else {
            throw new RuntimeException("No Driver for id: " + id);
        }
    }

    @Override
    public DriverDTO pickupDriver(String status) {
        Driver driver = repo.getAvailableDriver("Available");
        if (driver!=null) {
            return mapper.map(driver, DriverDTO.class);
        } else {
            throw new RuntimeException("No Driver Available");
        }
    }

    @Override
    public void deleteDriver(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No Driver for delete ID: " + id);
        }

    }

    @Override
    public List<DriverDTO> getAllDrivers() {
        List<Driver> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<DriverDTO>>() {
        }.getType());
    }

}
