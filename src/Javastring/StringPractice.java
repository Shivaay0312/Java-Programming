package Javastring;

public class StringPractice {
    public static void main(String[] args) {

        /// String Practice Set – 1

        // Questions :- String Practice

        String s = "Java Backend"; // find length
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(s.length() - 1));
        System.out.println(s.substring(5).toUpperCase());
        System.out.println(s.substring(0));

///  using Split() comma(",") Separators
        String name = "Java,SQL,Spring";
        String[] arr = name.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
 ///  using Split() Space(" ") Separators
        String text = "Java SQL Spring";
        String[] array = text.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        String p = "   Java Backend   ";
        System.out.println(p.trim());
    }
}
