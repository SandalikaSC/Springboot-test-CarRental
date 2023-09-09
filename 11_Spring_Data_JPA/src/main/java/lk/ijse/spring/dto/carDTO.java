package lk.ijse.spring.dto;

import lk.ijse.spring.entity.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class carDTO {
    private String regid;
    private TypeDTO type;
    private String brand;
    private String status;
    private String color;
    private String transmission;
    private String fuel;
    private int noPassengers;
    private double dailyRate;
    private double monthlyRate;
    private double freeKmDay;
    private double exKmRate;



}
