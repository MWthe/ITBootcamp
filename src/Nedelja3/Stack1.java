package Nedelja3;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        String x = "Hello";
        Stack<String> reverseString = new Stack<>();
        Stack<String> reverseString1 = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            reverseString.push(String.valueOf(x.charAt(i)));
        }
        for (int j = 0; j < reverseString.size(); j++) {
            reverseString1.push(reverseString.pop());
        }
        System.out.println(reverseString1);
    }
}

