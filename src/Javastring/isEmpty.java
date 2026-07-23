package Javastring;

public class isEmpty {
    public static void main(String[] args) {

        /// isEmpty();

        //Logic: isEmpty String check, String is Empty or Not.

        /// Example 1:

        String s = "";
        System.out.println(s.isEmpty()); //true
        // Why - String store 0 characters.

        ///Example 2:

        String name = "Java";
        System.out.println(name.isEmpty()); // false

/// ⭐ Important Difference:

        String a = " ";
        // This is not a Empty String, its Contains a "Space" Characters.

        System.out.println(a.isEmpty()); // False

        /// return Data type = boolean
        // Only return = true or false

    }
}
