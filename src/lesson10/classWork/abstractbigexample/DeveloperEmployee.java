package lesson10.classWork.abstractbigexample;

public class DeveloperEmployee extends Employee{
    private String[] frameworks = new String[10];

    @Override
    void paySalary() {
        int newBalance = getBankAccount().getBalance() + getSalaryPerMonth() + 1000;
        getBankAccount().setBalance(newBalance);
    }
}
