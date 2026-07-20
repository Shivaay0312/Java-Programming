package Javastring;

public class charlength {
   public static void main(String[] args) {

       /// charAt()
       //String second most important method
       ///This method find index char()

      //  Example: String name = "Backend";
       // find Index 0
       //Java se answer nikalenge:
       // name.charAt(0);
///     Syntax: charAt()
      // Syntax: variableName.charAt(index);
       //Example:
//       String name = "Backend";
//       System.out.println(name.charAt(0)); // output - B
       ///⭐ Golden Formula
//       Ye rule:
//          ✅ Arrays me bhi
//          ✅ Strings me bhi
//       same hai.
//       Length = Total Characters
//       Last Index = Length - 1

      /// Program 1 -> charAt();
       String company = "OpenAI";
       System.out.println(company.length()); // find char length
       System.out.println(company.charAt(2)); // find index character
       System.out.println(company.charAt(company.length()-1)); // find last Index char.
       /// classified this:- company.charAt(company.length() - 1)
       // Step 1 -> company.charAt() find index
       // Step 2 -> company.length() find char length = 6
       // Step 3 -> company.length()-1 => 6-1 => 5
       /// final Step -> company.charAt(company.length()-1)
       /// company.charAt(5) => I
///      Character : O  p  e  n  A  I
///     Index     : 0  1  2  3  4  5
   }
}
