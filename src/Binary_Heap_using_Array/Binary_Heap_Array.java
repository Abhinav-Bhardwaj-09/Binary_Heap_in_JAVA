package Binary_Heap_using_Array;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 21-04-2020
 * Time: 11:27
 */

public class Binary_Heap_Array {
    int arr [];
    int sizeofTree;


    //parameterised_constructor
    public Binary_Heap_Array(int size) {
        arr = new int[size + 1];
        sizeofTree = 0;                //if array index starts from 1.. if want to start from 0 then initilise it with -1.
    }

    public int sizofArray(){
        return arr.length;
    }


    public int SizeofTree(){
        return sizeofTree;
    }

    public void deleteHeapTree(){
        arr = null;
        System.out.println("Heap deleted...");
    }

    public boolean isHeapEmpty(){
        if ( sizeofTree == 0 ) return true;
        else return false;
    }

    public void PeekinHeap(){
        if (isHeapEmpty()) System.out.println(" Heap is empty...");
        else System.out.println(arr[1]);
    }

    public void insert(int value) {
        arr[sizeofTree + 1] = value;
        heapify(sizeofTree+1);
        sizeofTree++;
    }

    public void heapify(int index){
        int parent = index/2;
        if (index<=1){
            return;
        }
        if (arr[index]<arr[parent]){
            int temp = arr[index];
            arr[index]= arr[parent];
            arr[parent] = temp;
        }
        heapify(parent);
    }

    public void display_array(){
        for( int i = 1 ; i <= sizeofTree ; i ++ ){
            System.out.println("At index  :  " + i + " , value is  :  " + arr[i]);
        }
    }

}