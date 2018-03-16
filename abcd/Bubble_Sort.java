package abcd;

import java.util.*;
//This Program is for Bubble Sort
public class Bubble_Sort
{
 public static void main(String[] args) throws Exception{
     System.out.println("Enter the number of elements you want to enter for bubble sorting....");

     Scanner scn1 = new Scanner(System.in);
     int num_of_elements = scn1.nextInt();

     // Declaring the array of length suggested by user....
     int elementsArray[] = new int[num_of_elements];

     for(int i = 0; i<num_of_elements; i++)
     {
         System.out.printf("Enter your %d elements into the Array....",i+1);
         Scanner elements = new Scanner(System.in);
         elementsArray[i] = elements.nextInt();
         System.out.println();
     }

     System.out.println("Elements inside the Array are:----->");

     // In case of Arrays, try using the enhanced for loop....
     for(int j:elementsArray)
     {
         System.out.printf("%d ",j);
     }
     
     System.out.println();
     System.out.println("Sorted Elements using Bubble Sort are------->");

     for (int p = 0; p < num_of_elements ; p++ ) {
         for (int q = 1; q <= num_of_elements-1; q++ ) {
             if(elementsArray[q-1]>elementsArray[q])
             {
                 int temp = elementsArray[q-1];
                 elementsArray[q-1] = elementsArray[q];
                 elementsArray[q] = temp;
             }
         }
     }

     for(int r:elementsArray)
     {
         System.out.printf("%d ",r);
     }
 }
}

