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
public class LinkedList<T> {

    private Node first;
    private String tmpString;

    class Node {

        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
        
        
    }

    public void add(T data) {
        Node current = first;
        if (current != null) {
            while (true) {
                current = current.next;
                if (current.next == null) {
                    break;
                }
            }
            current.next = new Node(data);
        } else {
            first = new Node(data);
        }
    }

    @Override
    public String toString() {
        tmpString = "";
        Node current = first;
        while (true) {
            tmpString = tmpString + current.getData() + " ";
            current = current.next;
            if (current.next == null) {
                break;
            }
        }
        return tmpString;
    }

}
