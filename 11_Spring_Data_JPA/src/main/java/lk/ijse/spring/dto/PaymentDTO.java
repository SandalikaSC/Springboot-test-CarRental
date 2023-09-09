package lk.ijse.spring.dto;

import lk.ijse.spring.entity.RentDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private int pid;
    private String ptype;
    private double price;

    private RentDetailDTO rentDetailDTO;

//    public PaymentDTO(String ptype, double price, RentDetail rentDetail) {
//        this.ptype = ptype;
//        this.price = price;
//        this.rentDetail = rentDetail;
//    }
}
