package Binary_Heap_using_Array;

public class Binary_HeapArray {
    int Array[];
    int sizeoftree;

    //constructor
    public Binary_HeapArray( int size ) {
        Array = new int[size];
        this.sizeoftree = 0;
    }

    public void insert (int value){
        Array[ sizeoftree + 1 ] = value;
    }
}
