package les5;

import java.util.Arrays;

public class UniqueCount {
    public static void main(String[] args) {
        int [] testArray = {4, 8, 3, 55, 11, 99, 3, 72, 11, 12, -3, 99, -7, 4, -7};
        System.out.println(uniqueCount(testArray));
    }

    public static int [] uniqueCountArray(int[] array) {
        array = sortAscending(array);
        int [] uniqueCountAr = new int[uniqueCount(array)];
        int index = 0;
        uniqueCountAr[0] = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] == uniqueCountAr[index])
                continue;
            index++;
            uniqueCountAr[index] = array[i];
        }
        return uniqueCountAr;
    }


    public static int uniqueCount(int [] array){
        array = sortAscending(array);
        int count = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] == array[i-1])
                count++;
                continue;
        }
        return array.length-count;
    }

    static int [] sortAscending(int[]array){
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
}
