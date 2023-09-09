package lk.ijse.spring.bean;

//@Component
public class Item {
    public Item() {
        System.out.println("Item Instantiated");
    }

    public void saveItem() {
        System.out.println("Item Saved");
    }
}
