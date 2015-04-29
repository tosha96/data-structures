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
public class IntList {
    private int[] intArray;
    private int[] temp;
    private IntList tempList;
    private int tempInt;
    private String tempString;
    
    public IntList(int listSize) {
        intArray = new int[listSize];
    }
    
    public IntList() {
        this(0);
    }
    
    private void resize(int newSize) {
        temp = new int[newSize];
        if (newSize > intArray.length) {
            System.arraycopy(intArray, 0, temp, 0, intArray.length);
        } else {
            System.arraycopy(intArray, 0, temp, 0, temp.length);
        }
        intArray = temp;
        temp = null;
    }
    
    public void add(int i) {
        resize(intArray.length + 1);
        intArray[intArray.length - 1] = i;
    }
    
    public int get(int index) {
        if (index < intArray.length && index >= 0) {
            return intArray[index];
        } else {
            System.out.println("Index out of range");
            return -1;
        }
    }
    
    public void set(int index, int i) {
        if (index < intArray.length && index >= 0) {
            intArray[index] = i;
        } else {
            System.out.println("Index out of range");
        }
    }
    
    public void insert(int index, int s) {
        if (index < intArray.length) {
            resize(intArray.length + 1);
            System.arraycopy(intArray, index, intArray, index + 1, intArray.length - (index + 1));
            intArray[index] = s;
        } else {
            resize(index + 1);
            intArray[index] = s;
        }
    }
    
    public void remove(int index) {
        if (index < intArray.length) {
            System.arraycopy(intArray, index + 1, intArray, index, intArray.length - (index + 1));
            resize(intArray.length - 1);
        } else {
            System.out.println("Index out of range");
        }
    }
    
    /*public void remove(int s) {
        tempIndex = find(s);
        if (tempIndex == -1) {
            System.out.println("String not in list");
        } else {
            remove(tempIndex);
        }
    }*/
        
    public int size() {
        return intArray.length;
    }

    public int find(int s) { //returns index of string, or -1 if string is not found
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == s) {
                return i;
            }
        }
        return -1;
    }
    
    public IntList getSublist(int start, int end) {
        tempList = new IntList(end - start + 1);
        for (int i = 0; i <= (end - start); i++) {
            tempList.set(i, intArray[start + i]);
        }
        return tempList;
    }
    
    public void clear() {
        intArray = new int[0];
    }
    
    public void removeDuplicates() {
        tempList = new IntList();
        outerloop:
        for (int i : intArray) {
            for (int j = 0; j < tempList.size(); j++) {
                if (tempList.get(j) == i) {
                    continue outerloop;
                }
            }
            tempList.add(i);
        }
        intArray = tempList.getIntArray();
    }

    public void generateRandom(int amount) {
        tempInt = intArray.length;
        resize(intArray.length + amount);
        for (int i = tempInt; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100);
        }
    }
    
    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }
    
    @Override
    public String toString() {
        tempString = "";
        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1)
                tempString += intArray[i];
            else
                tempString += intArray[i] + ", ";
        }
        return tempString;
    }
}
