package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.carDTO;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepo repo;
    @Autowired
    ModelMapper mapper;

    @Override
    public void saveCar(carDTO dto) {
        if (!repo.existsById(dto.getRegid())) {

            Car c = mapper.map(dto, Car.class);
            repo.save(c);

        } else {
            throw new RuntimeException("Car already exist..!");
        }

    }

    @Override
    public void updateCar(carDTO dto) {
        if (repo.existsById(dto.getRegid())) {
            Car c = mapper.map(dto, Car.class);
            repo.save(c);
        } else {
            throw new RuntimeException("No such Car for update..!");
        }
    }

    @Override
    public carDTO searchCar(String id) {
        Optional<Car> car = repo.findById(id);
        if (car.isPresent()) {
            return mapper.map(car.get(), carDTO.class);
        } else {
            throw new RuntimeException("No car for id: " + id);
        }
    }

    @Override
    public void deleteCar(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No car for delete Regno: " + id);
        }

    }

    @Override
    public List<carDTO> getAllCar() {

        List<Car> all = repo.findAll();
//        System.out.println(all.isEmpty());
//        System.out.println(all.get(0).getStatus());
        List<carDTO> carDTOS=mapper.map(all, new TypeToken<List<carDTO>>() {
        }.getType());
//        System.out.println(carDTOS.get(0).getStatus());

        return carDTOS;
    }

}
