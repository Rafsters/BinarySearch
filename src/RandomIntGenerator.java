import java.util.*;

public class RandomIntGenerator {

    public static int[] generateRandomArrayOfIntegers(int size){

        ArrayList<Integer> unniqueRandomArray = new ArrayList();
        do{
            Random r = new Random();
            int randomInt = r.nextInt(99) + 1;
            if(!unniqueRandomArray.contains(Integer.valueOf(randomInt))){
                unniqueRandomArray.add(Integer.valueOf(randomInt));
            }
        }while (unniqueRandomArray.size() < size);
        System.out.println("Generated array");
        for (Integer i:
             unniqueRandomArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sorted array");
        Collections.sort(unniqueRandomArray);
        for (Integer i:
                unniqueRandomArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] arr = unniqueRandomArray.stream().mapToInt(i -> i).toArray();
        return arr;
    }

}
