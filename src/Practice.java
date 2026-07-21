public class Practice {
    public static void main(String[] args) {
        /// Searching --> 1-D Array, Linear Search is one of the first DSA problem you should master.

        /// Simple & easy
//        int[] arr = {10,20,30,90,100,50};
//         int target = 100; // we want to check 100
//        for(int i = 0; i<arr.length; i++){
//            if(arr[i]==target){
        //                System.out.println("Element found at index" + arr[i]);
        /// This is the easy Way to find Linear Search without Using if, else condition;

        // Program --> 2 Linear Search

        // arr[i] = current element
        // index or i = current index

//        int[] arr = {10,20,30,90,100,50};
//        int target = 10; // we want to check 100
//
//        int index= -1; // Isko isliye use karte ki current index mai jo value target kar
//        // rahe h wo exixt nhi kar raha hai

//        for(int i=0; i< arr.length; i++){
//            if(arr[i]==target){
//
//                index = i; // loop ke baad  index print krna ke liye
//                break; // break is a statement that also find target index and target value
//            }
//        }
//        if( index != -1){
//            System.out.println("Element "+ "," +arr[index]+ "," +"found at Index"+ "," +index);
//        }
//        else
//            System.out.println("Element not found at Index" );
//    }

        ///ArrayMockTest1.java
        //Even elements
        //Odd elements

//        // Program 1 --> Count - Even elements & Odd elements
//        int[] arr = {12, 25, 8, 19, 30, 7, 15};
//        int evenelement = 0;
//        int oddelement = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                evenelement++;
//            }
//            else {
//                oddelement++;
//            }
//        }
//        System.out.println(evenelement+ " " +oddelement);
//    }
//}
////DSA Connection--->
// ye question sikhata hai :-
// Array Traversal
// Counting Technique
// Conditional Logic
// Ye technique baad me
//HashMap Frequency, Sliding Window, aur Counting Problems me bhi use hogi.

        /// ArrayMockTest2.java
        //       Positive numbers
//        Negative numbers
//        Zero

        // Program --> 1 Count

        ///🧠 DSA Connection-->
        /// Ye question sikhata hai:
        /// Multiple Conditions (if - else if - else)
        /// Categorization
        /// Counting Technique
        /// Ye approach baad me data classification aur filtering problems me kaam aati hai.
//        int[] arr = {10, -5, 0, 25, -12, 0, 8, -1};
//        int postive = 0;
//        int negative = 0;
//        int zero = 0;
//
//        for(int i=0; i< arr.length; i++){
//            if(arr[i]>0){
//                postive++;
//
//            } else if (arr[i]<0){
//                negative++;
//            }
//
//            else{
//                zero++;
//            }
//        }
//        System.out.print(postive+ " " +negative+ "," +zero);

        ///ArrayMockTest3.java
//        Maximum element
//        Minimum element

        // Program --> 1
//        int[] arr = {15, 8, 22, 5, 30, 18};
//        int max = arr[0];
//        int min = arr[0];
//         for(int i=0; i< arr.length; i++){
//             if(arr[i]>max) {
//                 max = arr[i];
//             }
//             ///Use separate if when:
//         // When Both Condition are Independent
////             Examples:
////             Maximum & Minimum
////             Count Vowels & Count Digits
////             Sum Positive & Sum Negative
//             if (arr[i]<min){
//                 min = arr[i];
//             }
//         }
//        System.out.println(max+ " " +min);

        ///ArrayMockTest4.java
        ///Second Largest Element.--- Most Important Interview Question

        // Program -1
//        int[] arr = {15, 8, 22, 5, 30, 18};
//        int largest = arr[0];
//        int secondlargest = -1; ///-1 sirf ek temporary value hai.
//        ///Abhi tak second largest mila nahi hai, isliye -1 rakh do
//
//        for(int i=0; i< arr.length; i++){
//          if(arr[i]>largest){
//              secondlargest = largest; // Purane largest ko secondLargest bana do,
//              largest = arr[i];              // aur naye element ko largest bana do."
//
//          } else if (arr[i]>secondlargest) {
//              secondlargest = arr[i];
//          }
//        }
//        System.out.println(secondlargest);
//    }
//}

//⭐ Ek Golden Rule yaad rakho
//if
//Matlab:
//"first condition ko check karo."
//else if
//Matlab:
//"Pehla if false ho tabhi mujhe check karo.
//else
//Matlab:
//"Upar sab false ho gaye, ab mujhe chalao."

/// Frequency --> is a Important topic of DSA pattern, which study in Counting.
        // program - 1
        /// This frequency Algorithm just find Only single elements
//        int[] arr = {10,20,30,10,20,20};
//        // freq = {0, 0, 0, 0, 0};
//        int target = 20; // Single element Frequency ....
//        int count = 0;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==target){
//                count++;
//            }
//        }
//        System.out.println(count); // 3 output
//    }
//}

/// Program - 2,,,,
// Frequency Array --> array ke sabhi numbers ki frequency
        // ek sath batata hai
/// Rule;-
        ///Frequency Array;- Size of frequency Array = Maximum element+1
        int[] arr = {1,2,2,3,4,3,1,2,1};
        //find the frequency of each elements in an array
        // Time Complexity = O(n)

        // Step 1: Find Maximum element in Array
        int max = arr[0];
         for(int i=0; i< arr.length; i++)
         {
             if(arr[i]>max) {
                max = arr[i];
             }
         }
        System.out.println(max);

        // Step 2: Find frequency of each element in Array

        int[] freq = new int[max+1];
        for(int i =0; i<arr.length; i++)
        {
            freq[arr[i]]++; // Most important line

            //  let ; arr[0] =1
            //  freq[1]++;
//            // first;
//            // freq[1] = 0;
//            // then ,,, freq[1] = 1
//            // again = freq[1] = 2
//            // third time = freq[1] = 3 // Output 1->3
        } // Second loop using pint frequency
      for(int i=0; i<freq.length;i++)
      {
          if(freq[i]>0){
              System.out.println(i+ "->" +freq[i]);
          }
      }
    }
}