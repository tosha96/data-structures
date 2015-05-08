/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import java.util.Iterator;

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
        LinkedList<String> testList = new LinkedList<>();
        
        /*testStack.push("This");
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
        
        System.out.println("");*/
        
        testList.add("This");
        testList.add("is");
        testList.add("a");
        testList.add("test");
        
        System.out.println(testList);
        System.out.println(testList.get(0));
        
        testList.remove(1);
        testList.insert("Insert", 1);
        
        Iterator itr = testList.iterator();
        /*for (String s : testList) {
            
        }*/
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
    
}
