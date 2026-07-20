package Javastring;

public class equalsIgnoreCase {

    ///1.equals();

    // Problem 1 -
//    String a = "JAVA";
//    String b = "java";
    // Yes both are same, but capitals letters or Small letters Difference
 /// Lekin Java ka equals() kya karega?
    ///System.out.println(a.equals(b)); // Output = false

    /// .equals() capital aur small letters ko alag maanta hai.

    ///2. equalsIgnoreCase();
    // Solution;- Java ne ek aur method diya: equalsIgnoreCase
    // Meaning;- Ignore capitals or Small letter then Compare
    ///Example-1
//    String a = "JAVA";
//    String b = "java";
//System.out.println(a.equalsIgnoreCase(b)); // Output - true
    ///Example-2 ,,,,, this example not follow equalsIgnoreCase
//    String a = "Java";
//    String b = "Python";
//    System.out.println(a.equalsIgnoreCase(b));
    /// Output - false ,,, But why .....
    /// Because the reason is words difference.


}
