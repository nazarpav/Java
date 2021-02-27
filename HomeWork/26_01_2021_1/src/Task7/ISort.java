package Task7;

import java.util.Arrays;
import java.util.Collections;

public interface ISort {
    public default void SortAsc(int arr[]){
        Arrays.sort(arr);
    }
    public default void SortDesc(int arr[]){
        Arrays.sort(new int[][]{arr}, Collections.reverseOrder());
    }
}
