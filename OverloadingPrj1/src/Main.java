
/**
 * Method Overloading
 *
 * Benefits:  cumbersome to create different names for similar methods
 * Use the same method but with different parameters
 *
 * Method signature is different by parameters
 *
 * Return type cannot be overloaded.
 *
 * Theory: Can it be possible if the function is assigned to a variable and the compiler
 * checks the type of the variable?
 *
 * The return type is not part of the signature unlike the parameter. So it cannot be differentiated.
 */
class Sample {

    public void print(int a) {
        System.out.println("int - " + a);
    }

    public void print(double a) {
        System.out.println("double - " + a);
    }

    public void print(String a) {
        System.out.println("string - " + a);
    }


}


public class Main {

    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.print(10);
        obj.print(10.2);
        obj.print("abc");


    }


}

