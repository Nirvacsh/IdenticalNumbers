import java.util.ArrayList;
import java.util.List;

public class TaskTwo {

    public static void main(String... args) {

        final int ARRAYS_SIZE = 10;

        int[] firstArray = new int[ARRAYS_SIZE];
        int[] secondArray = new int[ARRAYS_SIZE] ;
        List<Integer> result = new ArrayList<>();

        System.out.println("First array: ");
        for ( int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 20 + 1);
            System.out.print(firstArray[i] + " ");
        }
        System.out.println("\nSecond array: ");
        for ( int j = 0; j < secondArray.length; j++) {
            secondArray[j] = (int) (Math.random() * 20 + 1);
            System.out.print(secondArray[j]+ " ");
        }

        System.out.print("\nIdentical numbers: ");
        for (int temp : firstArray) {
            for (int k : secondArray) {
                if (k == temp && !result.contains(temp)) {
                    result.add(temp);
                    break;
                }
            }
        }
    }
}
