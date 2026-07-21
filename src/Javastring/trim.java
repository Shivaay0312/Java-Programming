package Javastring;

public class trim {
   public static void main(String[] args) {
       //// Strings are immutable.
        /// trim();
       // Logic → Syntax → Practice
     // Supposed given a Input = "   Java Backend   " = ___Java Backend___
       /// And find only Java Backend
       // That means Remove starting and ending extra spaces.
       // trim() not Remove middle spaces. Example:- " Java   Backend  "

       /// For this Concept Java Using trim() Method
       //Syntax - variableName.trim();

       /// Example 1:-
       String name = "   Backend   ";
       System.out.println(name.trim()); // Output = Backend

       /// Backend Connection:

      // User login = "   Shivnandan   "
       // Store in DataBase = Shivnandan
       /// If not trim() the String Login Username is Failed.
       // Real project => username = username.trim();
   }
}
