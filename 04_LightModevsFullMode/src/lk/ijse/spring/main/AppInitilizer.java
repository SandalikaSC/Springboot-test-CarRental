package lk.ijse.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitilizer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();
    }
}
