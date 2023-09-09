package lk.ijse.spring.dto;

import lk.ijse.spring.entity.Car;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.entity.Payment;
import lk.ijse.spring.entity.Register;
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
public class RentDetailDTO {
    private int rentid;
    private String date;
    private String returndate;
    private String pickuptime;
    private String status;
    private RegisterDTO registerDTO;
    private DriverDTO driverDTO;
    private List<PaymentDTO> paymentDTOS=new ArrayList();
    private List<carDTO> carsDtos =new ArrayList<>();
}
