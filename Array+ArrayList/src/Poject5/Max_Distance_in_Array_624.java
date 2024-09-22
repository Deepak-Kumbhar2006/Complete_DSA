package Poject5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Max_Distance_in_Array_624 {
    public static void main(String[] args) {
        List<List<Integer>> arrays = new ArrayList<>();
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {4, 5};
        Integer[] array3 = {1, 2, 3};

        arrays.add(Arrays.asList(array1));
        arrays.add(Arrays.asList(array2));
        arrays.add(Arrays.asList(array3));

        System.out.println(arrays);
        System.out.println(arrays.size());
        System.out.println(maxDistance(arrays));
    }
    public static int maxDistance(List<List<Integer>> arrays){
        int max = 0;
        for (int row = 0; row < arrays.size(); row++) {
            for (int j = 0; j < arrays.get(row).size() ; j++) {
                max = arrays.indexOf(j);
                return max;
            }
        }
        return -1;
    }
}
