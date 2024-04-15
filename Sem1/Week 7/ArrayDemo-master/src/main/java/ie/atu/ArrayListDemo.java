package ie.atu;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();



        int indexValue = 0;
        int x = 100;
        for (int value: arrayList){
            arrayList.add(x);
            x = x + 100;
            indexValue++;
        }

        indexValue = 0;
        for (int value: arrayList){
            System.out.println("Element at Index " + indexValue + ": " + value);
            indexValue++;
        }






}
