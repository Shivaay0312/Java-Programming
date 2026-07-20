public class Conditionalstatement {
    static void main(String[] args) {
        ////if Statement.
//        int age = 21; //Bhai, if condition tab chalegi jab uske andar wali condition true hogi.
//        if ( age>=18){
//            System.out.println("eligible for voting");}
        // Condition true hai, isliye output aayega:

//int age = 15;
//if(age>=18){
//    System.out.println("minor"); // where --> 15 >= 18 → false
        // Condition false hai, isliye if ke andar ka code nahi chalega aur koi output nahi aayega.
// Simple Rule --> if condition
//    Condition true  → if chalega ✅
//    Condition false → if nahi chalega ❌

//        int marks = 25;
//
//        if (marks >= 35) { //25 >= 35 ye false hai isliye nhi chalega.
//            System.out.println("Pass"); // if ke andar
//        }
//
//        System.out.println("End");  // if ke bahar

        //Example: Even-Odd Program

//        int num = 8;
//        if (num % 2==0) {
//            System.out.println("Even");
//        }else{
//            System.out.println("odd");

        // Example: Positive-Negative Number
//            int number = -10;
//            if(number > 0){
//                System.out.println("postive");}
//                    else{
//                System.out.println("negative");

        // practice --> 1 again
//        int age =  21;
//        if(age>=18) {
//            System.out.println("Adult");
//        }else{
//            System.out.println("Minor");

        //// 🔥 if-else Statements

        // Syntax
//        if (condition) {
//            // condition true
//        }
//        else {
//            // condition false

        // Example --> if-else statement
//        int age = 15;
//
//        if (age >= 18) { //15 >= 18
//            System.out.println("Eligible");
//        }
//        else {
//            System.out.println("Not Eligible"); //Condition false hai, isliye: else statement
//// Output--> Not Eligible
//        }

        //// else-if & else-if ladderStatement 🔥
        //// Jab 1 ya 2 se zyada conditions hoti hain:

//        if (condition1) {
//            // code
//        }
//        else if (condition2) {
//            // code
//        }
//        else if (condition3) {
//            // code
//        }
//        else {
//            // code
        //Is poore structure ko else-if ladder bolte hain
        //Ek else if  → else-if statement
        //Kai else if → else-if ladder

//        int marks = 75;
//
//        if (marks >= 90) {
//            System.out.println("A Grade");
//        } else if (marks >= 75) {
//            System.out.println("B Grade");
//        } else if (marks >= 35) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }

        // Important Rule of else-if ladder
        //Java upar se neeche conditions check karta hai.
        //Pehli true condition milte hi:
        //✓ usi block ko execute karta hai
        //✓ baaki conditions ko skip kar deta hai
        //Agar koi bhi condition true na ho:
        //✓ else block execute hota hai

        //// Nested if 🔥
        //// Yaani ek if ke andar doosra if.

//        if (condition1) {
//            if (condition2) {
//                // code

        //Example--> Nested-if
//        int age = 20;
//        boolean idCard = true;
//        if (age >= 18) { //20 >= 18 //true
//            //Ab bahar wala if true hai, isliye andar wala if check hoga.
//            if (idCard = true) { //idCard == true //true
//                System.out.println("Vote");//Vote
//            }
//        }

        ////Example--> Nested-if
        ////Agar bahar wala if false ho
//        int age = 16;
//        boolean idCard = true;
//        //bahar wala if
//        if (age >= 18) { // 16>=18 // false
//
//            //Andar wala if
//            // Ab bahar wala if hi false ho gaya, to andar wala if check hi nahi hoga.
//            if (idCard == true) {
//                System.out.println("Vote de sakte ho"); //Kuch bhi print nahi hoga.
//            }
//        }

        ////Rule:
        //Outer if true  → Inner if check hoga.
        //Outer if false → Inner if check nahi hoga.
        //// Dono conditions true hongi tabhi andar wala code chalega.

        /// Switch Statement 🔥
        ////Jab ek hi variable ki kai values check karni ho, tab switch use karte hain.

        //Example -->
//        int day = 2;
//
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//
//            case 2:
//                System.out.println("Tuesday");
//                break;
//
//            case 3:
//                System.out.println("Wednesday");
//                break;
//
//            default:
//                System.out.println("Invalid");

////     Step 1: Java kya check karega?
//        day = 2
        //Jaise hi case 2 mil gaya:
        //System.out.println("Tuesday"); //Tuesday

        ////Step 2: break kya karta hai?
        //  break;
//        Matlab:
//        "Switch se bahar nikal jao."
//        Agar break hai:
//        To sirf:
//        Tuesday print hoga

        //// Step 3: Agar break na ho?
//        Ab break nahi hai, isliye neeche ke sab cases bhi chalenge.
//        Output:
//        Two
//        Tuesday
//        Invalid
//        Isko fall-through kehte hain.

        ////Step 4: default kya hai?
//        Agar koi bhi case match na kare.
        //Invalid

        //// Step 5: Kab use karein?
        //  Agar:
//        1 = Monday
//        2 = Tuesday
//        3 = Wednesday
//        Jaise fixed values check karni ho.

        //// Logical Operators 🔥
//      Ye tab use hote hain jab hume ek se zyada conditions check karni hoti hain.
//       Java mein 3 logical operators hote hain:

//        &&  → Dono true
//        ||  → Koi ek true
//        !   → Ulta kar do

        //// Example --> logical Operators
//        int age = 20;
//        boolean idCard = flase;
//
//        if (age >= 18 && idCard == true) {
//            System.out.println("Vote");
//        } else {
//            System.out.println("No Vote");
//        }
    }
}





