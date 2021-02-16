package les5;

import java.util.Arrays;

public class BanksPractice {
    public static void main(String[] args) {
        String [] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina"};
        int [] balances = {100, 500, 8432, 99, 12000, -50};

        System.out.println(Arrays.toString(findClientsByBalance(names, balances, 500)));
        System.out.println(Arrays.toString(findClientsWithNegativeBalance(names, balances)));

        depositMoney(names, balances, "Ann", 1000);
        System.out.println(Arrays.toString(balances));
    }

    static String [] findClientsByBalance(String [] clients, int [] balances, int n){
        int count = 0;
        for(int balance : balances){
            if (balance >= n){
                count++;
            }
        }

        String [] result = new String[count];
        int resIndex = 0;
        for (int i = 0; i < balances.length; i++){
            if (balances[i] >= n){
                result[resIndex] = clients[i];
                resIndex++;
            }
        }
        return result;
    }
    static String [] findClientsWithNegativeBalance(String [] clients, int [] balances){
        int count = 0;
        for(int balance : balances){
            if (balance < 0){
                count++;
            }
        }

        String [] result = new String[count];
        int resIndex = 0;
        for (int i = 0; i < balances.length; i++){
            if (balances[i] < 0){
                result[resIndex] = clients[i];
                resIndex++;
            }
        }
        return result;
    }
    static void depositMoney(String [] clients, int [] balances, String client, int money){

//        int clientIndex = findClientIndexByName(clients, client);
//        int moneyToDeposit = clculateDepositAmountAfterCommission(money);

        balances[findClientIndexByName(clients, client)] += clculateDepositAmountAfterCommission(money);
    }

    static int findClientIndexByName(String [] clients, String client){
        int clientIndex = 0;
        for (String cl : clients){
            if(cl == client)
                clientIndex++;
        }
        return clientIndex;
    }

    static int clculateDepositAmountAfterCommission(int money){
        return money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01);
    }
}
