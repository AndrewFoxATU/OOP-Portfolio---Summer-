package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArrayDemo {
    public static void main(String[] args) {

        int[] anArray;

        anArray = new int[10];
        int indexValue = 0;
        int x = 100;
        for (int value: anArray){
            anArray[indexValue] = x;
            x = x + 100;
            indexValue++;
        }

        indexValue = 0;
        for (int value: anArray){
            System.out.println("Element at Index " + indexValue + ": " + value);
            indexValue++;
        }

        }
    }