/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Tosha
 */
public class LinkedList<T> implements Iterable {

    private Node first;
    private String tmpString;

    @Override
    public Iterator iterator() {
        Iterator<T> it = new Iterator<T>() {
            private Node current = first;

            @Override
            public boolean hasNext() {
                return current.next != null;
            }

            @Override
            public T next() {
                if (this.hasNext()) {
                    current = current.next;
                    return current.getData();
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
        return it;
    }

    class Node {

        private T data;
        private Node next;
        private Node prev;

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
                if (current.next == null) {
                    break;
                }
                current = current.next;
            }
            current.next = new Node(data);
        } else {
            first = new Node(data);
        }
    }
    
    public void insert(T data, int index) {
        Node before = nodeAtIndex(index - 1);
        Node after = before.next;
        
        before.next = new Node(data);
        before.next.next = after;
    }
    
    public T remove(int index) {
        Node current = nodeAtIndex(index - 1);
        Node tmp = null;

        tmp = current.next;
        current.next = current.next.next;
        return tmp.getData();
    }
    
    private Node nodeAtIndex(int index) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public T get(int index) {
        return nodeAtIndex(index).getData();
    }

    @Override
    public String toString() {
        tmpString = "";
        Node current = first;
        while (true) {
            tmpString = tmpString + current.getData() + " ";
            current = current.next;
            if (current == null) {
                break;
            }
        }
        return tmpString;
    }

}
