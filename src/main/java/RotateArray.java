import java.util.Arrays;

/**
 * Created by jaymilnamow on 6/25/16.
 */
public class RotateArray {

    int[] reorderArray(int[] intArray, int x) {

        int[] reorderedIntArray = new int[intArray.length];
        for (int j = intArray.length - x; j < intArray.length; j++) {
            reorderedIntArray[j-intArray.length+x] = intArray[j];

        }

        for (int i = 0; i < intArray.length; i++) {
            reorderedIntArray[i + x] = intArray[i];
        }

        return reorderedIntArray;
    }

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5};
        int x = 2;

        RotateArray rotateArray = new RotateArray();
        int[] reorderedIntArray = rotateArray.reorderArray(intArray,x);
        System.out.print(Arrays.toString(reorderedIntArray));
    }
}
