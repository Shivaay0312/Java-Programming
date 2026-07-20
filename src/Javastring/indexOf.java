package Javastring;

public class indexOf {
    public static void main(String[] args) {

        /// indexOf() or lastIndexOf()

        /// indexOf();- Also check first word index or Characters

        ///Example 1; Given a String, find Character 'e' index.

        String language = "Backend";
        /// Syntax;- variableName.indexOf(value);

        // manually Check-
//       Character : B  a  c  k  e  n  d
//       Index     : 0  1  2  3  4  5  6
        System.out.println(language.indexOf('e')); // Output = 4

        ///Example 2; Given a String, find a word index.

        String text = "I love Java";

// Manually Check;
//        I   l o v e   J a v a
//        0 1 2 3 4 5 6 7 8 9 10

        System.out.println(text.indexOf("Java")); // Output = 7
        // Kyuki "Java" index 7 se start ho raha hai.

        ///Example 3; If the value are not found ?.

        String message = "Backend";
        System.out.println(message.indexOf('z')); // Output = -1

        /// ⚠️ Golden Rule:
        // If Value are not found always return index -1

        /// Backend Connection:
        // Login Time; ---> Example
        String email = "abc@gmail.com";
        if(email.indexOf('@') != -1){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Not valid Email");
        }
    }
}
/// indexof(); string used in the real project.

//// lastIndexOf() Logic; - Last Occurrence

///Example 1;  lastIndexOf()
//       String word = "Programming";
//       System.out.println(word.lastIndexOf('m')); // Output = 7

// 'm' character are given in the word are 2 time
// First Occurrence index = 6
// Last Occurrence index = 7