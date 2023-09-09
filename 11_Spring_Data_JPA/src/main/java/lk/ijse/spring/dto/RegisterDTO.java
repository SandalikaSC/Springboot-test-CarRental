package lk.ijse.spring.dto;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.RentDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
 public class RegisterDTO {
     private String rid;
    private Date date;
    private CustomerDTO customer;
    private List<RentDetail> rentDetails=new ArrayList<>();

    public RegisterDTO(String rid, Date date, CustomerDTO customer) {
        this.rid = rid;
        this.date = date;
        this.customer = customer;
    }
}
