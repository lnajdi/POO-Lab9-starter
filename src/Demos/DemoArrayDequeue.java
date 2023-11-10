package Demos;

import java.util.ArrayDeque;

public class DemoArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("www.bing.com");
        stack.push("https://openai.com/chatgpt");
        stack.push("https://www.freecodecamp.org/");
        System.out.println("Top of stack: " + stack.peek());
        System.out.println("Popped from stack: " + stack.pop());
        System.out.println("Top of stack after pop: " + stack.peek());
    }
}