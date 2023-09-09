package lk.ijse.spring.dto;

import lk.ijse.spring.entity.RentDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDTO {

    private String did;
    private String name;
    private String nic;
    private String status;
    private String contact;
    private List<RentDetailDTO> rentDetailDTOS=new ArrayList<>();

//    public DriverDTO(String did, String name, String nic, String status, String contact) {
//        this.did = did;
//        this.name = name;
//        this.nic = nic;
//        this.status = status;
//        this.contact = contact;
//    }
}
