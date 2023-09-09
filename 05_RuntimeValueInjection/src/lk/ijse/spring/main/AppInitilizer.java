package lk.ijse.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitilizer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

//        Spring Environment = System.getEnv()+ System.getProperties()+ Resource Bundles

//        System Environment variables
//        Map<String, String> environment = System.getenv();
//        for (String key : environment.keySet()) {
//            String value = environment.get(key);
//            System.out.println(key + " : " + value);
//        }
//
//        System.out.println("=============================");
//
//        //Java Environment Variables
//        Properties properties = System.getProperties();
//        for (Object key : properties.keySet()) {
//            Object value = properties.get(key);
//            System.out.println(key + " : " + value);
//        }


    }
}
