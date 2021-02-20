package lesson8.simpleInheritance;

public class Arithmetic {
    public static void main(String[] args) {
        int [] array = {1, 18, -32, 77, 9, -36, 13, -5, 6, 99, 18, 38, -10, 200};
        System.out.println(check(array));
    }
    static boolean check (int [] array){
        int minEl = array[0];
        int maxEl = array[0];
        for (int el : array){
            minEl = Math.min(minEl, el);
            maxEl = Math.max(maxEl, el);
        }
        return maxEl + minEl > 100;
    }
}
