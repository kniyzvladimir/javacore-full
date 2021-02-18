package les6;

import java.util.Date;
public class Deal {

    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;

    public Deal(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Deal() {
    }

    public void confirmDeal() {
        isConfirmed = true;
        dateConfirmed = new Date();
    }

    public boolean checkPrice() {
        return price > 1000;
    }

    public boolean isValidType() {
        return type.equals("Buy") || type.equals("Sale");
    }
}
