import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

////       1--> for loop

//        // program --> 1
////        for (int i = 1; i <= 10; i++){
////            System.out.println("Hello");
//        // using decrement method
////            for(int i = 10; i>=1;i--){
////                System.out.println(i);
//
//        ///ek level aur upr chalte hai add & sub krte hai loop ko
//        // Program --> 1
//        for (int i = 2; i <= 10; i += 2) {
//            System.out.println(i);
//        }
//        //Program -->2
//        for (int i = 20; i >= 2; i -= 2) {
//            System.out.println(i);
//        }
//        // Program --> 3
//        for (int i = 1; i <= 20; i += 3) {
//            System.out.println(i);
//        }
//        // Program --> 4
//        for (int i = 100; i >= 10; i -= 10) {
//            System.out.println(i);
//        }
//        //// Input Based program --> Scanner + for loop.
        ////       Example-->  *Table Program*
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter number: ");
//        int num = sc.nextInt();
//
//        sc.nextLine(); //buffer line isko nhi bhi use kr sakte h kyoki ye single line program hai
//        for (int i = 1; i <= 10; i++) {
//
//            // System.out.println("num*i="+ num*i); // ---> ("num*i=" + num) * i aisa smjh raha h
//            // Isliye hum isko --> dusre tarike se likhenge.
//            System.out.println(num + " x " + i + " = " + (num * i));
//
     ////⭐ Sum of 1 to N (Without Formula)
//
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Enter Number: ");
//            int n = scanner.nextInt();
//
//            int sum = 0;
//
//            for (i = 1; i <= n; i++) {
//                sum = sum + i;
//            }
//            System.out.println("Sum = " + sum);

////           ✅ Factorial

//            Scanner me = new Scanner(System.in);
//            System.out.print("Enter Number: "); // yaha par prinln use kiya hai sahi h??
//            int a = me.nextInt();
//
//            int fact = 1;
//             for (int i =1;i<=a;i++) {
//                 fact = fact * i;
//             }
//            System.out.println("fact="+fact);

////         ✅ Nested loops & Pattern printing.
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//         int num = sc.nextInt();
//          for(int i=1;i<=3;i++){ //Outer Loop = Rows
//              for ( int j = 1; j<=i;j++){ //Inner Loop = Columns / Kitni baar print karna hai
//                  System.out.println(i);

    //// Pattern Printing-->Most Important topic to create logic programming
   //   1---> Shape ke basis par (Based on Structure)
        //Right-Angled Triangle (Trikon)
///without Inverted Star Pattern priting
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int num = sc.nextInt();

//        for(int i =1; i<=5; i++){

//            for (int j = 1; j <= i; j++)
//                System.out.print("*");{

//         System.out.println();

///Inverted Star Pattern priting
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int num = sc.nextInt();
//
//
//        for(int i = num; i>=1; i--) {
//
//              Number of stars in each row.
//            //int i = num; yaha ye likh de start mein to koi
//            bhi inverted print kara sakte hai
//
//            for (int j = 1; j <= i; j++)
//                System.out.print("*");{
//                System.out.println();

        /// WIthout Inverted pattern print
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Number: ");
//        int num = sc.nextInt();
//
//        for (int i = 1; i <=5; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();

////Java mein Number pattern ka ek simple code aur logic samjhao.
//
//             int n = 4; // Total 4 lines print karni hain
//
//                // Outer Loop: Rows ke liye (Line 1 se 4 tak)
//                for (int i = 1; i <= n; i++) {
//
//                    // Inner Loop: Har line mein numbers print karne ke liye (1 se lekar i tak)
//                    for (int j = 1; j <= i; j++) {
//                        System.out.print(i + " "); // '*' ki jagah hum 'j' ki value print kar rahe hain
//                    }
//
//                    System.out.println(); // Line change karne ke liye

        ////Java mein Floyd's Triangle pattern ka code aur logic samjhao.

//                int n = 5; // Total 4 lines ka pattern chahiye
//                int count = 1; // Yeh variable numbers ko continuous badhane ke liye hai
//
//                // Outer Loop: Rows ke liye
//                for (int i = 1; i <= n; i++) {
//
//                    // Inner Loop: Har row mein kitne elements print honge
//                    for (int j = 1; j <= i; j++) {
//                        System.out.print(count + " "); // count ki current value print hogi
//                        count++; // Print karne ke baad count 1 se badh jayega
//                    }
//
//                    System.out.println(); // Line change karne ke liye

        /// Space Pattern kya hota hai?

        //Jab pattern ko right side ya
        // center mein lana hota hai,
        // tab * se pehle spaces print karte hain.

        //// Isliye isme 3 loops ki soch hoti hai:

//        Outer Loop   -> Rows
//        1st Inner Loop -> Spaces
//        2nd Inner Loop -> Stars

        // 1. OUTER LOOP: Rows ke liye
//        for (int i = 1; i <= 5; i++) {
//
//            // 2. INNER LOOP 1: Spaces print karne ke liye (n - i tak)
//            for (int space = 1; space <= 5 - i; space++) {
//                System.out.print(" ");
//            }
//
//            // 3. INNER LOOP 2: Stars print karne ke liye (i tak)
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * "); // Notice kijiye yahan '*' ke baad space hai
//            }
//
//            // Ek line ka kaam khatam, ab next line par jao
//            System.out.println();
/// Right-Aligned Triangle (Right Justified Triangle)
//Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int num = sc.nextInt();
//
//        for(int i = 1; i<=num; i++) { // 1 outer loop
//
//            for (int space = 1; space <= num- i; space++) { // 1 Inner loop
        // num-1 krne par position mirror output ayega
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) { // 2 Inner loop
//            System.out.print("*");
//            }
//                System.out.println();
//                }
//            }
//    }




////🧠 Ek Concept Yaad Rakho

//for (rows) {
//
//        for (spaces) {
//        // print space
//        }
//
//        for (stars) {
//        // print star
//        }
//
//        // next line
//        }

//// ✅ Inverted Right Triangle

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int num = sc.nextInt();
//
//        for(int i = 5; i>=1; i--) { // Rows
//
//            for (int space = 1; space <= num-i; space++) { // space ...
//                //// num-1 karne par postion mirror hoga
//                System.out.print(" ");
//            }
//
//                    for (int j = 1; j <= i; j++) { // stars
//                        System.out.print("*");
//                    }
//                           System.out.println();
//                      }
////Example -->
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int num = sc.nextInt();
//
//        for(int i =1; i<=num; i++){// Outer loop
//
//            for(int space = 1; space<=num-i; space++) {   1 Inner Loop space
//               // yaha par space formula n-1 krne par stars ko hum apne hisab se nhi print kr sakte hai.
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){ // 2 Inner Loop
//           formula 2*i-1 krne par hum ("*") likhe sakte hai lekin hum simple method use karenge
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //// 3. 📚 while Loop
        // Jab tak condition true rahegi, tab tak loop chalta rahega.

        // Basic Syntax Rule -->

       /// while Loop ke 3 Parts

        // while loop horizental hota hai aur for loop vertical hota hai.

//        int i = 1;          // Initialization
//
//        while (i <= 5) {    // Condition
//
//            System.out.println(i);
//
//            i++;            // Update

        /// Program -->1 while loop
//         Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int num = sc.nextInt();
//        int i =1;
//        while(i<=num) { //✅ Condition ke baad ; nahi lagta.
//            // Difference 1 ✅
//            //while loop - Agar condition false hai, to loop ek baar bhi nahi chalega.
//            System.out.println(i);
//            i++;
//        }

        /// 4. 📚 do-while Loop-->

        // Pehle code execute hota hai, phir condition check hoti hai.
        // Basic Syntax -->

//        do{
//
//            // code
//
//        }
//        while(condition);

        /// Program -->1

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int n = sc.nextInt();
//
//        int i = n;
//        do {                //Code
//            System.out.println(i);
//            i++;              //Update
//        } while(i<=n);    //Condition

///do-while loop using Increment operators .\ program -- 1
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i<=5);

/// do-while loop using decrement operators .\ program -- 1
//        int k = 5;
//        do {
//            System.out.println(k);
//            k--;
//        } while (k>=1);

//// 5. break;

        // Program --> 1
//        for(int i = 1; i<=10;i++){
//            if (i == 4) {
//                break;
//            }
//            System.out.println(i);
//
//            }

    ////Program -->2 Using Input Based Program.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int n = sc.nextInt();
//
//        for(int i = 1; i<=n; i++){
//            if(i==6) { // 6 tak condition check krne ke liye 6 se badi digit likhana hoga
//                // usse chota likhana par wahi tak number print hoga
//                break;
//            }
//            System.out.println(i);
//        }

/// 6. Continue in loop
        //continue current iteration ko skip karta hai aur next iteration par chala jata hai.

       // Program 1 -->

//        for( int i = 1; i<=10;i++){
//            if(i==4) {
//                continue;
//            }
//            System.out.println(i);
//            }

        // program 2 --->

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number: ");
//        int n = sc.nextInt();
//
//        for(int i = 1; i<=10; i++){
//            if(i==4) {
//                continue;
//            }
//            if(i==3){
//                continue;
//            }
//            if (i == 8) {
//                break;
//            }
//            System.out.println(i);
//        }
//
        /// Loops ke fayde

//for( int i = 1; i<=100; i++){
//    if(i==100);
//    System.out.println("Shivaay Pathak");
//    }

        // program --> 1

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Ab yahan continue hai!
            }
            System.out.println(i);
        }
        System.out.println("Loop Khatam!");
   }
}
