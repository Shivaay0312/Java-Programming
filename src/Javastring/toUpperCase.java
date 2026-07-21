package Javastring;

public class toUpperCase {
    public static void main(String[] args) {

        //// toUpperCase() & toLowerCase()
        // Logic → Syntax → Practice

        /// 1. toUpperCase();

        // Logic:
        String name = "backend"; // Given String
        // Find Output = BACKEND

        // Then we are using a method: toUpperCase()

        /// Example -1. toUpperCase();
        String text = "backend";
        System.out.println(text.toUpperCase()); // Output = BACKEND

        ////  toLowerCase()
        // Opposite of toUpperCase

        // Logic
        String names = "JAVA"; // Output = java
        // Using Method = toLowerCase

        /// Example -1:

        String texts = "JAVA";
        // Syntax: variable.toLowerCase();
        System.out.println(texts.toLowerCase()); // Output = java

        /// Backend Connection:
        // Example:-
        // User type = JAVA
        // DataBase store = java
        /// We Normalizied using these two method
        /// 1. username = username.toLowerCase();
        /// 2. username = username.toLowerCase();
    }
}
/// Method always return a "New String".
//⭐ Important Concept
//String name = "backend"; // Wrong Way to find toUpperCase()
//name.toUpperCase();
//System.out.println(name);
// Output = backend,,, Not given - BACKEND
/// Why: Because String is Immutable, that means Original String is not Change.
//Method always return a "New String".


//String name = "backend"; //  Right Way to find toUpperCase()
//name = name.toUpperCase();
//System.out.println(name); // Output = BACKEND