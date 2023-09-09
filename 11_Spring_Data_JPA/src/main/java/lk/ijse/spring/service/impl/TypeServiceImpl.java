package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.TypeDTO;
import lk.ijse.spring.entity.Type;
import lk.ijse.spring.repo.TypeRepo;
import lk.ijse.spring.service.TypeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class TypeServiceImpl implements TypeService {

    @Autowired
    TypeRepo repo;



    @Autowired
    ModelMapper mapper;

    @Override
    public TypeDTO searchType(String tid) {
        Optional<Type> type = repo.findById(tid);
        if (type.isPresent()) {
            return mapper.map(type.get(), TypeDTO.class);
        } else {
            throw new RuntimeException("No Type for tid: " + tid);
        }    }


//    @Override
//    public TypeDTO searchType(String id) {
//        Optional<Customer> customer = repo.findById(id);
//        if (customer.isPresent()) {
//            return mapper.map(customer.get(), CustomerDTO.class);
//        } else {
//            throw new RuntimeException("No customer for id: " + id);
//        }
//    }



}
