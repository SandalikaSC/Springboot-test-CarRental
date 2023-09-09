package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    private String id;
    private String name;
    private String Email;
    private String address;
    private String contact;
    private String nic;

//    @OneToOne(mappedBy = "rid", cascade = CascadeType.ALL)
//    private Register register;


}
