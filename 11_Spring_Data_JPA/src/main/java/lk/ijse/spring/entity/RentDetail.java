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
public class RentDetail {
    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private int rentid;
    private String date;
    private String returndate;
    private String pickuptime;
    private String status;
//    private String nic;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rid" ,referencedColumnName = "rid",nullable = false)
    private Register register;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "did" ,referencedColumnName = "did",nullable = true)
    private Driver driver;


    @OneToMany(mappedBy ="rentDetail" ,cascade = CascadeType.ALL)
    private List<Payment> payment=new ArrayList();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "CarRent_Details" ,
            joinColumns = {@JoinColumn(name = "rentid" ,referencedColumnName = "rentid")},
            inverseJoinColumns = {@JoinColumn(name = "regid" ,referencedColumnName = "regid")})
            private List<Car> cars =new ArrayList<>();
}
