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
        if (isHeapEmpty()) System.out.println("Heap is empty...");
        else System.out.println(arr[1]);
    }



    public void insert(int value) {
        arr[sizeofTree + 1] = value;
        min_heapify(sizeofTree+1);
        sizeofTree++;
    }


    public void min_heapify(int index){
        int parent = index/2;
        if (index<=1){
            return;
        }
        if (arr[index]<arr[parent]){
            int temp = arr[index];
            arr[index]= arr[parent];
            arr[parent] = temp;
        }
        min_heapify(parent);
    }



    public int extractValue(){
        if (isHeapEmpty()) {
            System.out.println("Heap is empty...");
            return -1;
        } else {
            int result = arr[1];
            arr[1] = arr[sizeofTree];
            sizeofTree--;
            heapifyExtraction(1);
            return result;
        }
    }



    public void heapifyExtraction(int index){
        int left = index * 2;
        int right = ( index * 2 ) + 1;
        int smallestchild = 0;
        if ( sizeofTree < left ) return;
        else if( sizeofTree == left ){
            if (arr[index] > arr[left]){
                int temp = arr[index];
                arr[index] = arr[left];
                arr[left] = temp;
            }
            return;
        }
        else {
            if(arr[left] < arr[right]) smallestchild = left;
            else smallestchild = right;
            if(arr[index]>arr[smallestchild]){
                int temp = arr[index];
                arr[index] = arr [smallestchild];
                arr[smallestchild] = temp;
            }
        }
        heapifyExtraction(smallestchild);
    }



    public void display_array(){
        if(isHeapEmpty()) System.out.println("Heap is empty...");
        for( int i = 1 ; i <= sizeofTree ; i ++ ){
            System.out.println("At index  :  " + i + " , value is  :  " + arr[i]);
        }
    }

}