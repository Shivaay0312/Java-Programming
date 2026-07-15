public class ReverseArray {
   public static void main(String[] args) {

        //// ⭐This is the Two Pointer Technique -- DSA,,, Swapping Method
       /// Rule --> Reverse Array
       //Example 1 --> int[] arr = {10,20,30,40,50};
       // start pointers = 0;
       // End pointers = 4;
       // Swapping 4<->0 pointer swap honge aise hi sabhi start pointers, end pointer
       // se Swap honge sirf
       // Loop start < end tak chalta hai.

       int[] arr = {10,20,30,40,50};
       int start = 0;
       int end = arr.length-1; //expression
       while(start < end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
      }
       for(int i=0; i<arr.length; i++){
           System.out.print(arr[i]+ " ");
       }
   }
}
