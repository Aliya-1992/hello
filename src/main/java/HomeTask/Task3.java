package HomeTask;

import java.util.Collections;
import java.util.*;
import org.apache.commons.lang3.ArrayUtils;

public class Task3 {
    public static void main(String[] args) {
        int[] myArray = {1, 2};
        System.out.println(Arrays.toString(massivReverse(myArray)));

    }
    public static int[] massivReverse(int[] myArray) {
        ArrayUtils.reverse(myArray);

        return myArray;
    }

}
