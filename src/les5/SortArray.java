package les5;
import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int [] testArray = {4, 8, 55, 11, 99, 3, 72, 11, 12, -3};
        System.out.println(Arrays.toString(sortAscending(testArray)));
        System.out.println(Arrays.toString(sortDescending(testArray)));
    }

    public static int [] sortAscending(int[]array){
        for (int i = 0; i < array.length; i++){
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++){
                if (array[j] < min){
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }
    public static int [] sortDescending(int[]array){
        for (int i = 0; i < array.length; i++){
            int max = array[i];
            int maxId = i;
            for (int j = i+1; j < array.length; j++){
                if (array[j] > max){
                    max = array[j];
                    maxId = j;
                }
            }
            int temp = array[i];
            array[i] = max;
            array[maxId] = temp;
        }
        return array;
    }
}
