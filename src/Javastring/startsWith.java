package Javastring;

public class startsWith {
    public static void main(String[] args){

        /// startsWith();
        // Rule - Logic → Syntax → Practice

        // startsWith():- That only check a Strings start from a particular
        // character or Word is called startsWith();

        // Logic:-

        // Example:-
        String language = "Backend";
        System.out.println(language.startsWith("Back")); // Output = true

        // Syntax: Variable.startsWith("Back");

        // return type:
//        boolean:
//        true
//        false

        /// Backend Connection; Using the real Project

        // Example: 1
        String file = "photo.jpg";
        System.out.println(file.startsWith("photo")); // Output = true

        // Example: 2
        String url = "https://google.com";
        System.out.println(url.startsWith("https://")); // Output = true
    }
}
/// Java is case-sensitive :
// Java  ≠  java --> 💡 Hint: Java me uppercase aur lowercase alag hote hain.

/// Empty string:- ""
//Every String:
//Empty string start from zero 0.
//Empty string end from zero 0.

/// Thats means;
//.startsWith("")
//.endsWith("")
// Both are true
