package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.RentDetailDTO;
import lk.ijse.spring.entity.RentDetail;
import lk.ijse.spring.repo.RentDetailRepo;
import lk.ijse.spring.service.RentDetailService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RentDetailServiceImpl implements RentDetailService {

    @Autowired
    RentDetailRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveRent(RentDetailDTO dto) {
        RentDetail c = mapper.map(dto, RentDetail.class);

            repo.save(c);
    }

    @Override
    public void updateRent(RentDetailDTO dto) {
//        if (repo.existsById(dto.getRentid())) {
//            RentDetail c = mapper.map(dto, RentDetail.class);
//            repo.save(c);
//        } else {
            throw new RuntimeException("No such Rent  for update..!");

    }

    @Override
    public RentDetailDTO searchRent(String id) {
        Optional<RentDetail> rentDetail = Optional.ofNullable(repo.findRentDetailByRegisterAndStatus(id, "pending"));
        if (rentDetail.isPresent()) {
            return mapper.map(rentDetail.get(), RentDetailDTO.class);
        } else {
            throw new RuntimeException("No Rent for Registration no: " + id);
        }
    }



    @Override
    public List<RentDetailDTO> getAllRents() {
        List<RentDetail> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<RentDetailDTO>>() {
        }.getType());
    }

}
