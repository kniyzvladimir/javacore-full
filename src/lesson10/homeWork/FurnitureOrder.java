package lesson10.homeWork;

import java.util.Date;

public class FurnitureOrder extends Order{
    String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
    }
    String [] shipFromCitiesAllowed = {"Киев", "Львов"};

    public void validateOrder(){
        if (!stringInArray(this.shipFromCitiesAllowed, this.getShipFromCity()))
            System.out.println("Город отправки не валиден");
        if (this.getTotalPrice() < 500)
            System.out.println("Минимальная сумма заказа 500");
        if (this.getCustomerOwned().getName().equals("Тест"))
            System.out.println("Имя \"Тест\" не длпустимо");
    }

    public void calculatePrice(){
        double totalPrice = this.getBasePrice();
        totalPrice =  (totalPrice < 5000) ? totalPrice * 1.05 : totalPrice * 1.02;

        this.setTotalPrice(totalPrice);
    }
}
