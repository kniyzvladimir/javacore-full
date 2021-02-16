package les2;

public class SumAndDivision {
    public static void main(String[] args) {
        long sum = 0;
        for(int i = 0; i <= 1000; i++){
            sum += i;
        }
        long cel = sum / 1234;
        double ost =sum % 1234;
        System.out.println(ost > cel);
    }
}
