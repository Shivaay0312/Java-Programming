package Javastring;

public class compareTo {
    public static void main(String[] args) {

        /// compareTo(); Most important (Interview + DSA)
        // ⭐ Golden Rule:
//        compareTo()
//        Negative  → First String chhoti (alphabetically pehle)
//        0         → Dono same
//        Positive  → First String badi (alphabetically baad me)

        /// Logic:
        // 1. equals(); Equal or not Equal
        // 2. compareTo(); //Kaun pehle aayega?
                           //Kaun baad me aayega?
        // That means Compare alphabetical order.

        /// Example 1:-

        String a = "Apple";
        String b = "Banana";
        System.out.println(a.compareTo(b)); // Output = Negative Number = -1

        /// Why,,,,, Because Apple is first Come and small String that means negative numbers
        //Apple
        // ↓
        //Banana

        /// Example 2:-

        String c = "Banana";
        String d = "Apple";
        System.out.println(c.compareTo(d)); // Output = Positive number = 1

        /// Example 3:-

        String e = "Java";
        String f = "Java";
        System.out.println(e.compareTo(f)); // Output = Zero = 0

        /// Example 4:-
        String g = "Apple";
        String h = "Zoo";
        System.out.println(g.compareTo(h));

    }
}
/// There are all example Based on Golden Rule compareTo() method: