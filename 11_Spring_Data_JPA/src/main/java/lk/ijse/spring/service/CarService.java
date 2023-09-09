package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.carDTO;

import java.util.List;


public interface CarService {
    void saveCar(carDTO dto);

    void updateCar(carDTO dto);

    carDTO searchCar(String id);

    void deleteCar(String id);

    List<carDTO> getAllCar();
}
