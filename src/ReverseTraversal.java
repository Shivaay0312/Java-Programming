public class ReverseTraversal {
   public static void main(String[] args) {

       // Reverse Traversal --> i--(Increment) operator.
       // Loop Condition --> i >= 0
       ///Reverse loop me hum last index se start karte hain.( Example = arr.length - 1)
     /// RuleReverse loop -> for (int i=arr.length - 1; i >= 0; i--){

       // Program 1 --> Reverse Loop

       int[] arr = {10,20,30,40,50};
       for(int i=arr.length-1; i>=0; i--){
           System.out.println(arr[i]);
           /// arr[i] -->"Array ke current index ka element nikalo."
           /// arr[i] --> this is not using any Calculation operation.It's only Display (Output) operation
       }
   }
}

/// 📌 Golden Rule (Isko yaad kar lo)
///1. 🔹 Loop ke andar
// Jab har element par operation karna ho.
/// Example --> sum += arr[i]; ,,, if(arr[i] > max),,,,System.out.println(arr[i]);

///2. 🔹 Loop ke bahar
//Jab final result dikhana ho.
///Examples --> System.out.println(sum); ,,,
///System.out.println(min);,,
///System.out.println(max);
