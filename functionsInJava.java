public class functionsInJava {

public static void printHello() {
    System.out.println("hello world");  // creating function 
    return;
    
}
    public static void main(String[] args) {
        // function is block of code that can be used again and again
        // /function take some space in call stack


        // *** Syntax ***
        /*
->      returnType name(){
        body
        return Statement
        }
        */

       printHello();    // calling fucntion
       printHello();
    }
}
