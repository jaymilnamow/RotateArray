import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jaymilnamow on 6/25/16.
 */
public class RotateArray {

    List<Integer> reorderArray(int[] intArray, int x) {

        ArrayList<Integer> reorderedIntArray = new ArrayList<Integer>();

        for(int i=intArray.length-x; i<intArray.length; i++) {
            reorderedIntArray.add(intArray[i]);
        }

        for (int j = 0; j < intArray.length-x; j++) {
            reorderedIntArray.add(intArray[j]);
        }

        return reorderedIntArray;
    }

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 6};
        int x = 2;

        RotateArray rotateArray = new RotateArray();
        List<Integer> reorderedIntArray = rotateArray.reorderArray(intArray,x);
        System.out.print(Arrays.toString(reorderedIntArray.toArray()));
    }
}
