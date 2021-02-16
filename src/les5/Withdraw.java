package les5;

public class Withdraw {
    public static void main(String[] args) {
        String [] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John", "Test", "Test1"};;
        int [] balances = {100, 500, 8432, -99, 12000, -54, 0, Integer.MIN_VALUE, Integer.MAX_VALUE};

        System.out.println(withdraw(names, balances, "Test1", -1));
    }

    public static int withdraw(String[] clients, int[] balances, String client, int money) {
        int index = findClientIndexByName(clients, client);
        if (balances[index] - money < 0  || balances[index] < 0)
            return -1;
        balances[index] -= money;
        return balances[index];
    }
    static int findClientIndexByName(String [] clients, String client){
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client)
                return clientIndex;
            clientIndex++;
        }
        return -1;
    }
}
