package CodeWars;

public class SillyAddition {
    public static void main(String[] args) {

        System.out.println(add(248,208));

    }
    //https://www.codewars.com/kata/5effa412233ac3002a9e471d/java
    public static int add(int num1, int num2) {
        int firstNumber = (num1 / 100) + (num2 / 100);
        int secondNumber = (num1 % 100 / 10) + (num2 % 100 / 10);
        int thirdNumber = (num1 % 10) + (num2 % 10);
        if (num1+ num2 != 0) {
           return Integer.parseInt(firstNumber + "" + secondNumber + thirdNumber);
        }
        return 0;
    }
}