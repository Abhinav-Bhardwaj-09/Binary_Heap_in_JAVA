package Binary_Heap_using_Array;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 21-04-2020
 * Time: 11:29
 */

public class Binary_Heap_Main {
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            System.out.println();
            System.out.print("Enter the no. of elements you want to insert in tree :  ");
            int size = obj.nextInt();
            System.out.println();
            Binary_Heap_Array B_H_A = new Binary_Heap_Array(size);
            int element , option ;
            for ( int i = 0 ; i < size ; i++ ){
                if(i != 0) System.out.print("Enter the next element you want to insert in the tree   :  ");
                else System.out.print("Enter the first element in the tree  :  ");
                element = obj.nextInt();
                B_H_A.insert(element);
            }
            System.out.println();
            boolean Flag = true;
            while (Flag) {
                System.out.println("Press 1 : To display the elements of the tree.");
                System.out.println("Press 2 : To extract value from the tree.");
                System.out.println("Press 3 : To find the no. of elements in the tree.");
                System.out.println("Press 4 : To exit.");
                System.out.println();
                System.out.print("Enter your choice :  ");
                option = obj.nextInt();
                if ( option == 1 ) B_H_A.display_array();
                else if ( option == 2 ) System.out.println("Extracted value  :  " + B_H_A.extractValue());
                else if ( option == 3 ) System.out.println("Currently there are " + B_H_A.sizeofTree + "elements in the tree.");
                else if ( option == 4 ) Flag = false;
                else System.out.println(" Warning !!! Please select a valid option... ");

                if ( Flag == true) {
                    System.out.println();
                    System.out.println();
                }
            }
        }
    }