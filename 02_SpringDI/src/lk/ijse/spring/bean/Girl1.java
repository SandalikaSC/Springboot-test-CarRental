package lk.ijse.spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Girl1 implements GoodGirl {
    public Girl1() {
        System.out.println("Girl 1 Instantiated");
    }


    @Override
    public void chat() {
        System.out.println("Girl 1 Chatting With Boy");
    }
}
