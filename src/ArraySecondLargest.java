public class ArraySecondLargest {
    public static void main(String[] args) {

        /// Meaning of Second Largest, that means one Single array Second high Values Exist in the array.
        /// Array: {15   80   25   90   40}
        /// We create Two Variables -->1. Largest
        ///                             2. SecondLargest

        /// Initially:Largest = 15
        /// SecondLargest = -1,,,
        ///Why -->
        //Because when a new largest element is found,
        //the old largest element becomes the second-largest.

        ///  Program --> 1

        int[] arr = {10, 20, 50, 80, 90};
       int largest = arr[0];
        int secondLargest = -1;// Because I don't no second largest elements??

        for (int i = 0; i < arr.length; i++) {
           if(arr[i] > largest) {
               secondLargest = largest;
               largest = arr[i];
            }
           else if (arr[i] > secondLargest && arr[i] < largest){ // &&-->Both condition are true
               secondLargest = arr[i];
           //Condition 1 -> arr[i] > secondLargest,,Current elements greater than Second largest element.
               // Condition 2 -> arr[i] < largest,, Current element less than largest element
          // Condition 2 -> false hai isliye is case ko pahle wala if condition execute karega
           } //arr[i] < largest -> We using this, Second largest != largest
        }
        System.out.println(secondLargest);
    }
}


// Rule -> fill the Second largest elements.

/// Step 1
///
/// Largest = arr[0]
///
/// SecondLargest = -1
///
/// ----------------
///
/// Loop
///
/// If(Current > Largest)
///
/// {
///
/// SecondLargest = Largest
///
/// Largest = arr[i]
///
/// }
///
/// Else if(Current > SecondLargest)
///
/// {
///
/// SecondLargest = arr[i]
///
/// }