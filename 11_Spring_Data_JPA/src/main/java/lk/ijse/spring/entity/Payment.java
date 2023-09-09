package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment {
    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)

    private int pid;
    private String ptype;
    private double price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rentid" ,referencedColumnName = "rentid",nullable = false)
    private RentDetail rentDetail;

    public Payment(String ptype, double price, RentDetail rentDetail) {
        this.ptype = ptype;
        this.price = price;
        this.rentDetail = rentDetail;
    }
}
