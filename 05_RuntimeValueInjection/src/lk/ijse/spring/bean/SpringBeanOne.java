package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBeanOne {

//    public SpringBeanOne() {
//        System.out.println("Default Constructor");
//    }

//    public SpringBeanOne(@Value("C001") String id) {
//        System.out.println("One Arg Constructor");
//        System.out.println(id);
//    }

    //primitive Data types ,String ,arrays
//    public SpringBeanOne(@Value("C001") String id,@Value("10") int age,@Value("red,green,orange") String colors[]) {
//        System.out.println("One Arg Constructor");
//        System.out.println(id);
//        System.out.println(age);
//        for (String color : colors) {
//            System.out.println(color);
//        }
//    }

//    public SpringBeanOne() {
//        System.out.println("Default Constructor");
//    }


    @Autowired(required = false)
    public SpringBeanOne(@Value("C001") String name,@Value("10") int age) {
        System.out.println("Two Arg Constructor");
        System.out.println(name);
        System.out.println(age);
    }

    @Autowired(required = false)//select greediest constructor (max arguements)
    public SpringBeanOne(@Value("C001") String id,@Value("Dasun") String name,@Value("Galle") String address) {
        System.out.println("Three Arg Constructor");
        System.out.println(id);
    }





}
