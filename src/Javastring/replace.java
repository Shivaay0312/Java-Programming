package Javastring;

public class replace {
   public static void main(String[] args) {
        /// replace();
       //Logic → Syntax → Practice

       // Logic
       // Supposed that:
       String s = "Java";
       //Now you want to turn "Java" into "Python".
       //Yes, you want to replace "A" with "@".
       //There is a method for this in Java: // replace();

       ///Syntax: Character replace
      // variable.replace(oldChar, newChar);

       //////Syntax: String replace
       //variable.replace(oldString, newString);


       /// Example 1 (Character)

       String name = "Java";
       System.out.println(name.replace('a', 'x'));
       // Output = a->x = Jxvx

       /// Example 2 (Word)

       String text = "Java Backend";
       System.out.println(text.replace("Backend", "Developer"));

   /// Immutable Rule: Strings are Immutable.
       // Example - Immutable
       String a = "Java";
       // a.replace('a', 'x');
       a = a.replace('a', 'x');
       System.out.println(a);
   }
}
