public class Method {

    /// Program 1--->
//    public static void shiv(){
//        System.out.println(" I'm okay"); // method Declaration
//    }
//
//    static void main(String[] args) {
//        for(int i=1; i<=10; i++)
//            shiv(); // Method calling
//        }
//    }

    /// Program 2 --->
//    static void greet(String name) {
//        System.out.println("Hello " + name);
//    }
//
//    public static void main(String[] args) {
//
//        greet("Shivaay"); // name = shiv
//
//    }
//}

    /// Program 3---> Parameters & Arguments
//    static void add(int a, int b) {  // Parameters--> a, b // add --> methodname
//        System.out.println(a + "," + b);
//    }
//
//    public static void main(String[] args) {
//
//        add(10, 20); // Arguments --> 10, 20


    /// Method ka naam (add) hamesha uske kaam ke hisaab se rakho.
    /// example-->
//        greet()              // Greeting
//        add()                // Addition
//        subtract()           // Subtraction
//        calculateArea()      // Area
//        findMax()            // Maximum value
//        printDetails()       // Details print
//        calculateSalary()    // Salary calculate

    ///3. Return Type ---->📚 Topic: Return Type & return Keyword

    // Program --> 1
//        public static int multiply(int a, int b) {
//            int result = a * b;
//            return result; // 👈 Yeh result ki value lekar wapas main //method mein chala jayega
//        }
//    public static void main(String[] args){
//        int a = 10;
//        int b = 20;
//        int answer = multiply(a,b);
//        System.out.println(answer);

    // Program --> 2
    //  Return without Value
//    public static void add( int a, int b) {
//        System.out.println(a + b); // isme value Return nhi hogi
//        // ye pahle main method main jayega fir waha se code execute hoga
//    }
//
//    static void main(String[] args) {
//     add(10,20 ); //  Return without Value

    /// Practice --> Return Type & return keyword

    // 🎯 Chhota Question practice
    // Question --> 1
//    static void add(int a, int b) {
//    System.out.println(a + b);}

//public static void main(String[] args) {
//    add(10, 20);
//    }

    // Isme 30 kahan print ho raha hai?????
//    A. Method ke andar // option A
//    B. main() ke andar

    ////Ab yaad rakho:
//    void    → No value return
//    int     → Integer return
//    String  → Text return
//    boolean → true/false return
//    char    → Single character return

    //// Practice Program --> 1 boolean question

//    static boolean isJavaEasy() { // Return Type = boolean
//        return true; //Return Value = true
//    }
//
//    public static void main(String[] args) {
//
//        boolean ans = isJavaEasy(); //ans ki value = true
//
//        //⚠️ Java mein keyword hamesha lowercase hota hai:
////        true   // ✅ Correct
////        True   // ❌ Wrong

//        System.out.println(ans); // true

    /// Program 2 --> 🎯 Last Easy Question (char)
//    static char grade() { //✅ Return Type = char
//            return 'A';  //Return Value = 'A'
//        }
//
//        public static void main(String[] args) {
//
//            char g = grade(); //g ki value = 'A'
//
//            System.out.println(g);  //Output = A

    ///5.  Method Overloading -->

//   ⭐ Final Rule (Exam & Interview)
//    Method Name → Same ✅
//    Parameter List → Different ✅
//
//    Return Type → Matter nahi karta (sirf Return Type badalna enough nahi hai)

    /// Program --> 1 Ek Calculator program banao jisme:
//    public static int add(int a, int b) {
//                return a + b;
//            }
//
//            public static double add(double a, double b) {
//                return a + b;
//            }
//
//            public static int add(int a, int b, int c) {
//                return a + b + c;
//            }
//
//            public static void main(String[] args) {
//
//                System.out.println(add(10, 15));
//                System.out.println(add(10.5, 10.5));
//                System.out.println(add(10, 20, 30));
//            }
//        }

///        💻 Coding Question 2 - Ek method display() ko 3 baar overload karo.-> Method Overloading

//     public static int display(int a){
//         return (a);
//     }
//     public static String display( String name){
//         return (name);
//     }
//     public static String display( int a , String name){
//         return (a+ "," +name);
//     }
//
//   public static void main(String[] args) {
//
//       System.out.println(display(10));
//       System.out.println(display("Shiv"));
//       System.out.println(display(10, "Shiv"));
//    }
//}

    /// 💻 Coding Question 6--> Ek multiply() method overload karo:
//    public static int multiply(int a, int b) {
//        return a * b;
//    }
//
//    public static double multiply(double a, double b) {
//        return a * b;
//    }
//
//    public static int multiply(int a, int b, int c) {
//        return a * b * c;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(multiply(10, 20));
//        System.out.println(multiply(10.5, 10.5));
//        System.out.println(multiply(10, 20, 30));
//
//    }
//    static void main(String[] args) {
//
//        System.out.println("Git Test");
    static void main(String[] args) {

        System.out.println("Git Test");
    }
}