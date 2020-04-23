package Binary_Heap_using_Array;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 21-04-2020
 * Time: 11:29
 */

public class Binary_Heap_Main {
        public static void main(String[] args) {
            Binary_Heap_Array B_H_A = new Binary_Heap_Array(5);
            B_H_A.insert(12);
            B_H_A.insert(7);
            B_H_A.insert(6);
            B_H_A.insert(18);
            B_H_A.insert(8);
            B_H_A.display_array();
            System.out.println(B_H_A.SizeofTree());
            System.out.println();
            System.out.println(B_H_A.extractValue());
            System.out.println(B_H_A.extractValue());
            System.out.println(B_H_A.extractValue());
            System.out.println(B_H_A.extractValue());
            System.out.println(B_H_A.extractValue());
            System.out.println();
            System.out.println(B_H_A.SizeofTree());
            System.out.println();
            B_H_A.display_array();
        }
    }