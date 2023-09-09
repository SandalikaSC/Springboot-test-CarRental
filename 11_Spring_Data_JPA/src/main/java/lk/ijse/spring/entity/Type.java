package lk.ijse.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Type {
    @Id
    private String tid;
    private String type;
    private double lossdamage;

    @OneToMany(mappedBy ="type")
    @JsonIgnore
    private List<Car> car=new ArrayList<>();


    public Type(String tid, String type, double lossdamage) {
        this.tid = tid;
        this.type = type;
        this.lossdamage = lossdamage;
    }
}
