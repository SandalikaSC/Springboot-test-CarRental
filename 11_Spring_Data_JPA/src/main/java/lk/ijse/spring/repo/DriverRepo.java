package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DriverRepo extends JpaRepository<Driver, String> {
    @Query(value = "select * from driver where status=?1 LIMIT 1", nativeQuery = true)
    Driver getAvailableDriver(String id);
}
