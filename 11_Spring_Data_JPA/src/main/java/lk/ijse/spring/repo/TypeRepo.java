package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepo extends JpaRepository<Type, String> {

}
