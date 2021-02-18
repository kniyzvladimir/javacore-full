package les6;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        System.out.println(createDeal().checkPrice());
        createDealAndCallMethods();
    }

    public static Deal createDeal() {
        Deal objectDeal = new Deal(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
        return objectDeal;
    }

    public static Deal createDealAndCallMethods() {
        Deal objectDeal2 = new Deal(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");
        objectDeal2.confirmDeal();
        objectDeal2.checkPrice();
        objectDeal2.isValidType();
        return objectDeal2;
    }
}
