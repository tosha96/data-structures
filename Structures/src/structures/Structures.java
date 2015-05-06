/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

/**
 *
 * @author Tosha
 */
public class Structures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> testStack = new Stack<>(String.class);
        Queue<String> testQueue = new Queue<>(String.class);
        
        testStack.push("This");
        testStack.push("is");
        testStack.push("a");
        testStack.push("test");
        System.out.println(testStack);
        
        System.out.println(testStack.peek());
        
        testStack.pop();
        testStack.pop();
        System.out.println(testStack);
        
        System.out.println("");
        
        testQueue.push("This");
        testQueue.push("is");
        testQueue.push("a");
        testQueue.push("test");
        System.out.println(testQueue);
        
        System.out.println(testQueue.peek());
        
        testQueue.pop();
        testQueue.pop();
        System.out.println(testQueue);
    }
    
}
