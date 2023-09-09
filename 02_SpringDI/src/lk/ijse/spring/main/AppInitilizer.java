package lk.ijse.spring.main;

import lk.ijse.spring.bean.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitilizer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Boy boy = ctx.getBean(Boy.class);
        boy.chattingWithGirl();

        ctx.registerShutdownHook();
    }
}
