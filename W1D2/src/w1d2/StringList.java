/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d2;

/**
 *
 * @author Tosha
 */
public class StringList {
    private String[] strArray;
    private String[] temp;
    private int tempIndex;
    private String tempString;
    
    public StringList(int listSize) {
        strArray = new String[listSize];
    }
    
    public StringList() {
        this(0);
    }
    
    private void resize(int newSize) {
        temp = new String[newSize];
        if (newSize > strArray.length) {
            System.arraycopy(strArray, 0, temp, 0, strArray.length);
        } else {
            System.arraycopy(strArray, 0, temp, 0, temp.length);
        }
        strArray = temp;
        temp = null;
    }
    
    public void add(String s) {
        resize(strArray.length + 1);
        strArray[strArray.length - 1] = s;
    }
    
    public String get(int index) {
        if (index < strArray.length && index >= 0) {
            return strArray[index];
        } else {
            System.out.println("Index out of range");
            return null;
        }
    }
    
    public void set(int index, String s) {
        if (index < strArray.length && index >= 0) {
            strArray[index] = s;
        } else {
            System.out.println("Index out of range");
        }
    }
    
    public void insert(int index, String s) {
        if (index < strArray.length) {
            resize(strArray.length + 1);
            System.arraycopy(strArray, index, strArray, index + 1, strArray.length - (index + 1));
            strArray[index] = s;
        } else {
            resize(index + 1);
            strArray[index] = s;
        }
    }
    
    public void remove(int index) {
        if (index < strArray.length) {
            System.arraycopy(strArray, index + 1, strArray, index, strArray.length - (index + 1));
            resize(strArray.length - 1);
        } else {
            System.out.println("Index out of range");
        }
    }
    
    public void remove(String s) {
        tempIndex = find(s);
        if (tempIndex == -1) {
            System.out.println("String not in list");
        } else {
            remove(tempIndex);
        }
    }
        
    public int size() {
        return strArray.length;
    }

    public int find(String s) { //returns index of string, or -1 if string is not found
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public String toString() {
        tempString = "";
        for (int i = 0; i < strArray.length; i++) {
            if (i == strArray.length - 1)
                tempString += strArray[i];
            else
                tempString += strArray[i] + ", ";
        }
        return tempString;
    }
}
