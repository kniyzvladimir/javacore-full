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

    public void confirmDeal(boolean status, Date dateConfirmed) {
        isConfirmed = status;
        this.dateConfirmed = dateConfirmed;
    }

    public boolean checkPrice(int price) {
        return price > 1000 ? true : false;
    }

    public boolean isValidType(int buy, int sale) {
        if (buy > 0 && sale > 0)
            return true;
        return false;
    }
}

