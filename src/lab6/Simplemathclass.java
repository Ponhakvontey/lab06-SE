package lab6;

public class Simplemathclass {
    public static void main(String[] args){
        System.out.println("Hello, World!");
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static double division(double a, double b){
        if(a==0 && b==0){
            throw new IllegalArgumentException("Infinity");
        }
        if(b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }





}
