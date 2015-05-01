/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d3;

/**
 *
 * @author Tosha
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentArray a = new StudentArray(100);
        a.insert(1, "Joe", 6);
        a.insert(2, "Jane", 9);
        a.insert(3, "Matt", 8);
        
        a.displayAll();
        System.out.println();
        
        Student highestMark = new Student(0, "None", 0);
        for (int i = 0; i < a.getnElems(); i++) {
            if (a.get(i).getmark() > highestMark.getmark()) {
                highestMark = a.get(i);
            }
        }
        System.out.println(highestMark);
        System.out.println();
        a.delete(2);
        a.displayAll();
    }

}

class Student {

    private int id;
    private String name;
    private int mark;

    public Student(int id, String name, int mark) // constructor to initialize the values
    {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name + " Mark: " + mark;
    }

    public int getId() // get the Id
    {
        return id;
    }
    
    public int getmark() {
        return mark;
    }
}

class StudentArray {

    public int getnElems() {
        return nElems;
    }
    

    private Student[] a;               // reference to array
    private int nElems;               // number of data items

    public StudentArray(int max) // constructor
    {
        a = new Student[max];
        nElems = 0;
    }

    public Student find(int id) {
        for (int i = 0; i < nElems; i++) {
            if (a[i].getId() == id) {
                return a[i];
            }
        }
        return null;
    }

    public void insert(int id, String name, int mark) // Duplicates of id not allowed. Make a check before inserting values
    {
        if (nElems != a.length) {
            if (find(id) == null) {
                a[nElems] = new Student(id, name, mark);
                nElems++;
            } else {
                System.out.println("Student with this ID already exists");
            }
        } else {
            System.out.println("Array is full, cannot insert");
        }
    }

    public boolean delete(int id) {
        for (int i = 0; i < nElems; i++) {
            if (a[i].getId() == id) {
                System.arraycopy(a, i + 1, a, i, nElems - i);
                nElems--;
                return true;
            }    
        }
        return false;
    }
    
    public Student get(int index) {
        return a[index];
    }

    public void displayAll() // displays array contents
    {
        for (int i = 0; i < nElems; i++) {
            System.out.println(a[i]);
        }
    }
}
/*Output:
run:
ID: 1 Name: Joe Mark: 6
ID: 2 Name: Jane Mark: 9
ID: 3 Name: Matt Mark: 8

ID: 2 Name: Jane Mark: 9

ID: 1 Name: Joe Mark: 6
ID: 3 Name: Matt Mark: 8
BUILD SUCCESSFUL (total time: 0 seconds)
*/