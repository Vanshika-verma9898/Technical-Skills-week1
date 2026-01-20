package TechnicalSkills;
import java.util.*;

public class CountElmntMax_Itself {
    public static void main(String[] args) {
        // Given :- N array Elements
        // Q's :- Count no. of elements greater than itself 
        // eg 01 :- [-3,2,6,8,4,8,5]
        // eg 02(different scenario) :- [5,5,5,5] ans=0 (when all elements are equal no element is greater then itself)

        // Obv 01 :- For every max element there won't be any element greater then itself
        // Obv 02 :- Count total max Elements like in this eg 8 comes 2 times
        // then, count = 2 => after that minus the count from total array length
        // that is => arr.length-count => which is (7-2) => final correct answer is 5

        // Psuedocode
        // Step1:- Iterate and Find the max Element from the array.
        // Step2:- Iterate and get the no. of elements that are equal to max, that are not equal to max.
        // Step3:- Increment the Counter and print.

        // Code
        int count = 0;
        int maxVal = Integer.MIN_VALUE;
        int arr[] = {-3,2,6,8,4,8,5};
        // FIND Max Element
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        // count total elements
        for(int i=0; i<arr.length; i++){
           if(maxVal != arr[i]){
            count++;
           }
        }
        // print value of count 
        System.out.print("Total elements count whose having at least one element greater then itself : "+count);
    }
}
