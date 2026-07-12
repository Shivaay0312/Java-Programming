public class LinearSearch {
   public static void main(String[] args) {

       ///Logic --> Har element ko target se compare karo.
      /// if(arr[i] == target) --> This is Story of linear Search.
       /// Rule Linear Search -->  me hum element nahi, uski position (index) batate hain.

       int[] arr = {5, 10, 15, 20, 25};
       int target = 20;
       for(int i=0; i<arr.length; i++){
           if(arr[i]==target){//This is Story of linear Search.
               // Linear Search -> no compare elements, Compare only Index[i]
               System.out.println("Found at index " + i);
               /// i sirf for loop ke andar exist karta hai.
           }
       }
   }
}
////   int index = -1; why use this Index

///  "Element abhi tak nahi mila."

