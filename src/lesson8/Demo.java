package lesson8;

public class Demo {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("SomeBanck", "Denis", 1000, 50);
        savingAccount.depositMoney(100);

        System.out.println(savingAccount.moneyAmount);

        savingAccount.changeOwnerName("Oleg");

        System.out.println(savingAccount.ownerName);

        CheckingAccount checkingAccount = new CheckingAccount("SomeBanck", "Denis", 1000, 500);
        checkingAccount.changeOwnerName("Oleg");
        System.out.println(checkingAccount.ownerName);
    }
}
