package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private String id;
    private String name;
    private String email;
    private String address;
    private String contact;
    private String nic;


}
