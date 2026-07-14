public class ArraySorted {
  public static void main(String[] args) {

      // int[] arr = {10, 20, 30, 40, 50}; Sorted Array
      int[] arr = {5, 10, 8, 15}; // first not sorted array using break; statement
       boolean isSorted = true;

      for(int i=0; i< arr.length-1; i++){ //Loop hamesha chalega: i< arr.length-1 because arr[i+1]
          if(arr[i]>arr[i+1]){ //  i = 0, 1, 2 ,,,
              // i+1 = 0+1 = 1
              // i+1 = 1+1 = 2
              // i+1 = 2+1 = 3 ..arr[3] naam ka koi element hi nahi hai.
              // error arr[3]element  -> ArrayIndexOutOfBoundsException
               isSorted = false;
              break;
          }
      }
      if(isSorted) { // if and else condition use krne se Array real Condition check hogi
          System.out.println("Array is Sorted");
      }else
          System.out.println("Array is not Sorted");
          }
}

