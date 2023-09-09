package lk.ijse.spring.entity;

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
@Entity
public class Register {
    @Id
    private String rid;
    private Date date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cid",referencedColumnName = "id")
    private Customer customer;

    @OneToMany(mappedBy ="register" ,cascade = CascadeType.ALL)
    private List<RentDetail> rentDetails=new ArrayList<>();

    public Register(String rid, Date date, Customer customer) {
        this.rid = rid;
        this.date = date;
        this.customer = customer;
    }
}
