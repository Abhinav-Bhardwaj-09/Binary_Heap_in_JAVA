package Binary_Heap_using_Array;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 21-04-2020
 * Time: 11:27
 */
public class Binary_Heap_Array {
    int Array[];
    int sizeoftree;

    //constructor
    public Binary_Heap_Array(int size) {
        Array = new int[size];
        this.sizeoftree = 0;
    }

    public void insert(int value) {
        Array[sizeoftree + 1] = value;
    }
}