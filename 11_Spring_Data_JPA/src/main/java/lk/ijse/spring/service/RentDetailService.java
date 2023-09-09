package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.RentDetailDTO;

import java.util.List;


public interface RentDetailService {
    void saveRent(RentDetailDTO dto);

    void updateRent(RentDetailDTO dto);

    RentDetailDTO searchRent(String id);
    List<RentDetailDTO> getAllRents();
}
