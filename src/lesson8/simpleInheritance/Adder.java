package lesson8.simpleInheritance;

public class Adder extends Arithmetic{
    public static void main(String[] args) {
        System.out.println(add(-100, 17));
    }
    static int add(int a, int b){
        return a + b;
    }
}
