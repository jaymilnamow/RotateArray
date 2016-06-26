import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jaymilnamow on 6/25/16.
 */
public class RotateArray {

    List<Integer> reorderArray(int[] intArray, int x) {

        ArrayList<Integer> reorderedIntArray = new ArrayList<Integer>();

        for(int i=intArray.length+1-x; i<intArray.length; i++) {
            reorderedIntArray.add(i);
        }

        for (int j = 0; j < intArray.length+1-x; j++) {
            reorderedIntArray.add(j);

        }

        return reorderedIntArray;
    }

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5 , 6};
        int x = 3;

        RotateArray rotateArray = new RotateArray();
        List<Integer> reorderedIntArray = rotateArray.reorderArray(intArray,x);
        System.out.print(Arrays.toString(reorderedIntArray.toArray()));
    }
}
