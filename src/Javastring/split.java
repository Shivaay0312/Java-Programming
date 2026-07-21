//package Javastring;

public class split {
    public static void main(String[] args) {

        /// split(); Most Important method in string
        //Logic → Syntax → Practice

        // Logic:
        //Supposed that a string :

        String s = "Java,SQL,Spring";

        // We want to Split in Horizental:
        //Ex:
        //Java
        //SQL
        //Spring

        // There is Method in Java.
        ///split();

        /// Syntax:
        // String[] arr = variableName.split("separator");
        // ⚠️ Dhyan do! This is important topic
        /// split() return String[] (String Array).

        /// Example 1. split() comma Separator
        String name = "Java,SQL,Spring";
        String[] arr = name.split(",");

        // In the memory:-
        //arr[0] = Java
        //arr[1] = SQL
        //arr[2] = Spring

        /// Print this method Two type, 1 method without loop, 2nd method using loop
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}

//// Example 2. split() space Separator

//        String text = "Java Backend Developer";
//        String[] array = text.split(" "); // // split() returns String[]
//
//        // Where  " " Space is separator.
//        for (int j = 0; j<array.length; j++) {
//            System.out.println(array[j]);
//        }
//    }
//}

//// Example 3. split() Dash "-" Separator
  static void main(String[] args) {
  String i = "10-20-30-40";
  String[] arrays = i.split("-");
  for(int k=0; k< arrays.length; k++){
      System.out.println("arr[]"+ "," +arrays[k]);

      // Output:
      //arr[0] = 10
      //arr[1] = 20
      //arr[2] = 30
      //arr[3] = 40
  }
  }
  /// Separator = Jis character ya text ko dekhkar String toot jaaye.
//Examples:
//Java,SQL,Spring
///       ↑
//Separator = , (Comma separator)