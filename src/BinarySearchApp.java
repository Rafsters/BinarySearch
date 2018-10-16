/*

Topic: Usage of divide and conquer algorithm in Binary Search
Authors: Rafał Kwiecień, Kamil Maj
Group: KrDUIs2012Is

 */
public class BinarySearchApp {
    public static void main(String args[]){
        int arr[] = RandomIntGenerator.generateRandomArrayOfIntegers(25);
        int n = arr.length;
        int x = 34;
        int result = BinarySearch.binarySearch(arr, x);
        System.out.println();
        if (result == -1)
            System.out.println("Element " + x + " is not present in generated array. Try again!");
        else
            System.out.println("Element " + x + " found at " +
                    "index " + result);
    }
}
