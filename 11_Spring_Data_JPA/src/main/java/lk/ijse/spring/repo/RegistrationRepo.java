package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Register, String> {

}
