/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import java.lang.reflect.Array;

/**
 *
 * @author Tosha
 */
public class Stack<T> {
    private T[] internalArray;
    private T[] tempArray;
    private T temp;
    private Class<T> c;
    String tmpString;
    
    public Stack(Class<T> c) {
        this.c = c;
        this.internalArray = makeArray(c, 0);
    }
    
    private T[] makeArray(Class<T> c, int size) {
        @SuppressWarnings("unchecked")
        final T[] a = (T[]) Array.newInstance(c, size);
        return a;
    }
    
    public T peek() {
        return internalArray[internalArray.length - 1];
    }
    
    public T pop() {
        temp = peek();
        tempArray = makeArray(c, (internalArray.length - 1));
        System.arraycopy(internalArray, 0, tempArray, 0, tempArray.length);
        internalArray = tempArray;
        return temp;
    }
    
    public void push(T obj) {
        tempArray = makeArray(c, (internalArray.length + 1));
        System.arraycopy(internalArray, 0, tempArray, 0, internalArray.length);
        tempArray[tempArray.length - 1] = obj;
        internalArray = tempArray;
    }
    
    @Override
    public String toString() {
        tmpString = ""; 
        for (int i = 0; i < internalArray.length; i++) {
            if (i == internalArray.length - 1) {
                tmpString = tmpString + internalArray[i];
            } else {
                tmpString = tmpString + internalArray[i] + ", ";
            }
        }
        return tmpString;
    }
}
