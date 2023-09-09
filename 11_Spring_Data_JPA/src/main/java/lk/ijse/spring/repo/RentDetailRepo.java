package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.RentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentDetailRepo extends JpaRepository<RentDetail, Object> {
    RentDetail findRentDetailByRegisterAndStatus(String id, String address);
}
