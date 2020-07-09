package Farzaneh.A2;

public class Main {
    public static void main(String[] args) {
        Overload objOne = new Overload();

        int myNum1 = objOne.plusMethod(8, 5);
        double myNum2 = objOne.plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
