package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.DriverDTO;

import java.util.List;


public interface DriverService {
    void saveDriver(DriverDTO dto);

    void updateDriver(DriverDTO dto);

    DriverDTO searchDriver(String id);

    DriverDTO pickupDriver(String status);

    void deleteDriver(String id);

    List<DriverDTO> getAllDrivers();
}
