package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer, String> {

    Customer findCustomerByName(String name);

    List<Customer> findAllByAddress(String address);

    long countAllById(String id);

    Customer findCustomerByNameAndAddress(String name, String address);

    List<Customer> findCustomerByAddressContaining(String address);

    @Query(value = "select * from customer where id='C001'", nativeQuery = true)
    Customer getMyCustomer();

    //    params
    //positional parameters
    //Named params

    //positional
    @Query(value = "select * from customer where id=?1 and name=?2", nativeQuery = true)
    Customer getMyCustomer2(String id, String name);

    //named params
    @Query(value = "select * from customer where id=:myID and name=:myName", nativeQuery = true)
    Customer getMyCustomer3(@Param("myID") String id, @Param("myName") String name);

    //    jpql
    @Query(value = "FROM Customer C")
    List<Customer> allCustomers();

    //    jpql
    @Query(value = "SELECT c FROM Customer c where c.id=?1 ")
    Customer searchACustomerByJPQL(String id);


}
