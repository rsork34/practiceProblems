import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    static int[] test1 = {1, 2, 3, 4};
    static int[] test2 = {1, 2, 3, 9};
    static int[] test3 = {9, 9, 9};
    static int[] test4 = {0};
    static int[] test5 = {9};
    static int[] test6 = {1, 9 , 9};

    public static void main(String[] args) {
        AddOne addOne = new AddOne();
        ArrayList<int[]> testList = new ArrayList<>();
        testList.add(test1);
        testList.add(test2);
        testList.add(test3);
        testList.add(test4);
        testList.add(test5);
        testList.add(test6);

        for (int[] origArray: testList) {
            System.out.println("\nBefore: " + Arrays.toString(origArray));
            origArray = addOne.addOne(origArray);
            System.out.println("After: " + Arrays.toString(origArray) + "\n");
        }
    }
}
