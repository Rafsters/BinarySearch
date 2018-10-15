/*

Topic: Usage of divide and conquer algorithm in Binary Search
Authors: Rafał Kwiecień, Kamil Maj
Group: KrDUIs2012Is

 */
public class BinarySearchApp {
    public static void main(String args[]){
        int arr[] = RandomIntGenerator.generateRandomArrayOfIntegers(15);
        int n = arr.length;
        int x = 6;
        int result = BinarySearch.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element " + x + " found at " +
                    "index " + result);
    }
}
