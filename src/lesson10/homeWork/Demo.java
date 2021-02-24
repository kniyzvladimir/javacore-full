package lesson10.homeWork;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        Customer vladimir = new Customer("Vladimir", "Одесса", "Мужской");
        Customer svetlana = new Customer("Svetlana", "Ужгород", "Женский");

        ElectronicsOrder pc = new ElectronicsOrder("Mac", new Date(), "Харьков", "Одесса", 20000, vladimir);
        FurnitureOrder table = new FurnitureOrder("Table", new Date(), "Львов", "Ужгород", 1500, svetlana);

        pc.calculatePrice();
        pc.validateOrder();
        pc.confirmShipping();

        table.calculatePrice();
        table.validateOrder();
        table.confirmShipping();
    }
}
