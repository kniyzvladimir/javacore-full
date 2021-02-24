package lesson10.homeWork;

import java.util.Date;

public class ElectronicsOrder extends Order {
    int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
    }

    public void validateOrder() {
        switch (this.getShipFromCity()) {
            case "Киев":
            case "Одесса":
            case "Днепр":
            case "Харьков":
                break;
            default:
                System.out.println("Город отправки не валиден");
                break;
        }
        switch (this.getShipToCity()) {
            case "Киев":
            case "Одесса":
            case "Днепр":
            case "Харьков":
                break;
            default:
                System.out.println("Город доставки не валиден");
                break;
        }
        if (this.getTotalPrice() < 100)
            System.out.println("Минимальная сумма заказа 100");
        if (this.getCustomerOwned().getGender().equals("Женский") == false)
            System.out.println("Покупатель может быть только женского пола");
    }

    public void calculatePrice(){
        double totalPrice = 0;
        double dostavkaKoef;
        dostavkaKoef = (this.getShipToCity().equals("Киев") || this.getShipToCity().equals("Одесса")) ? 0.1 : 0.15;
        totalPrice = this.getBasePrice() + this.getBasePrice() * dostavkaKoef;
        totalPrice =  (totalPrice > 1000) ? totalPrice * 0.95 : totalPrice;

        this.setTotalPrice(totalPrice);
     }
}