package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Transactional
@SpringBootTest
class CustomerRepoTest {

    @Autowired
    CustomerRepo repo;


    public void saveRandomCustomers(){
        Customer c1 = new Customer("C001", "Kamal", "Galle", 10000);
        Customer c2 = new Customer("C002", "Danuka", "Galle", 20000);
        Customer c3 = new Customer("C003", "Ranuka", "Kaluthara", 30000);
        Customer c4 = new Customer("C004", "Dasun", "Mathugama", 40000);
        repo.save(c1);
        repo.save(c2);
        repo.save(c3);
        repo.save(c4);
    }

    @Test
    public void saveCustomer() {
        saveRandomCustomers();
        List<Customer> all = repo.findAll();
        assertTrue(all.size() == 4);
    }

    @Test
    public void testA() {
        saveRandomCustomers();
        Customer ranuka = repo.findCustomerByName("Ranuka");
        assertNotNull(ranuka);
        System.out.println("=====================");
        System.out.println(ranuka.getAddress());
        System.out.println("=====================");
    }



    @Test
    public void testB() {
        saveRandomCustomers();
        List<Customer> galle = repo.findAllByAddress("Galle");
        System.out.println("=====================");
        System.out.println(galle.size());
        System.out.println("=====================");
    }


    @Test
    public void testc() {
        saveRandomCustomers();
        long c001 = repo.countAllById("C001");
        System.out.println("=====================");
        System.out.println(c001);
        System.out.println("=====================");
    }


    @Test
    public void testd() {
        saveRandomCustomers();
        Customer customer = repo.findCustomerByNameAndAddress("Kamal", "Galle");
        System.out.println("=====================");
        System.out.println(customer.getId());
        System.out.println("=====================");
    }

    @Test
    public void teste() {
        saveRandomCustomers();
        List<Customer> customers = repo.findCustomerByAddressContaining("G");
        System.out.println("=====================");
        System.out.println(customers.size());
        System.out.println("=====================");
    }

    @Test
    public void testf() {
        saveRandomCustomers();
        Customer customers = repo.getMyCustomer();
        System.out.println("=====================");
        System.out.println(customers.getName());
        System.out.println("=====================");
    }


    @Test
    public void testg() {
        saveRandomCustomers();
        Customer customers = repo.getMyCustomer2("C003","Ranuka");
        System.out.println("=====================");
        System.out.println(customers.getAddress());
        System.out.println("=====================");
    }

    @Test
    public void testh() {
        saveRandomCustomers();
        Customer customers = repo.getMyCustomer3("C001","Kamal");
        System.out.println("=====================");
        System.out.println(customers.getAddress());
        System.out.println("=====================");
    }

    @Test
    public void testi() {
        saveRandomCustomers();
        List<Customer> customers = repo.allCustomers();
        System.out.println("=====================");
        System.out.println(customers.size());
        System.out.println("=====================");
    }

    @Test
    public void testj() {
        saveRandomCustomers();
        Customer customers = repo.searchACustomerByJPQL("C001");
        System.out.println("=====================");
        System.out.println(customers.getAddress());
        System.out.println("=====================");
    }





}
