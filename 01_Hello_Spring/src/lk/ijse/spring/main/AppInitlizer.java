package lk.ijse.spring.main;

import lk.ijse.spring.bean.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("JVM is about to Shut Down");
//                ctx.close();
//            }
//        }));

public class AppInitlizer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
//        ctx.registerShutdownHook();

//        //get a bean from class type
//        Customer bean = ctx.getBean(Customer.class);
//        bean.saveCustomer();
//        //get a bean by class type
//        Item bean1 = ctx.getBean(Item.class);
//        bean1.saveItem();
//        //bean with @bean annotation
//        FakeConnection bean2 = ctx.getBean(FakeConnection.class);
//        bean2.testConnection();

////        Bean ID
//        Customer bean = (Customer) ctx.getBean("c1");
//        System.out.println(bean);
//
//        Item bean2 = (Item) ctx.getBean("item");
//        System.out.println(bean2);
//
//
//
//        FakeConnection bean3 = (FakeConnection) ctx.getBean("fid");
//        System.out.println(bean3);


//        Customer bean1 = ctx.getBean(Customer.class);
//        Customer bean2 = ctx.getBean(Customer.class);
//        System.out.println(bean1);
//        System.out.println(bean2);


        Customer bean = ctx.getBean(Customer.class);
        ctx.close();



    }
}
