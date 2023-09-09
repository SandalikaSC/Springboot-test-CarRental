package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy implements DI {
    //DI methods
    //property Injection
    //constructor injection
    //setter method injection
    //Interface through Injection

    //Property Injection
//    @Autowired
//    @Qualifier("girl1")
//    GoodGirl goodGirl;


    GoodGirl goodGirl;


    //constructor Injection
//    @Autowired
//    public Boy(GoodGirl girl) {
//        this.goodGirl=girl;
//        System.out.println("Boy Instantiated");
//    }


    public Boy() {
        System.out.println("Boy Instantiated");
    }

//    @Autowired//setter method injection
//    public void setGirl(GoodGirl girl){
//        goodGirl=girl;
//
//    }

    @Autowired
    @Override
    public void inject(GoodGirl girl) {
        this.goodGirl = girl;
    }


    public void chattingWithGirl() {
//        Girl girl= new Girl();
//        girl.chat();
        goodGirl.chat();
    }


}
