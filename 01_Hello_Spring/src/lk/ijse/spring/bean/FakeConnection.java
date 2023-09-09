package lk.ijse.spring.bean;

public class FakeConnection {
    public FakeConnection() {
        System.out.println("Fake Connection Instantiated");
    }

    public void testConnection(){
        System.out.println("Connection is OK");
    }
}
