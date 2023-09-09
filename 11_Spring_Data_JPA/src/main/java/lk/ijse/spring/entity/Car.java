package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
    @Id
    private String regid;

    @ManyToOne
    @JoinColumn(name = "tid" ,referencedColumnName = "tid",nullable = false)
    private Type type;

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

    @ManyToMany(mappedBy = "cars",cascade = CascadeType.ALL)
    private List<RentDetail> rentDetails=new ArrayList<>();

    public Car(Type type, String brand, String status, String color, String transmission, String fuel, int noPassengers, double dailyRate, double monthlyRate, double freeKmDay, double exKmRate) {
        this.type = type;
        this.brand = brand;
        this.status = status;
        this.color = color;
        this.transmission = transmission;
        this.fuel = fuel;
        this.noPassengers = noPassengers;
        this.dailyRate = dailyRate;
        this.monthlyRate = monthlyRate;
        this.freeKmDay = freeKmDay;
        this.exKmRate = exKmRate;
    }
}
