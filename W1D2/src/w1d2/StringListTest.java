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
public class StringListTest {
    public static void main(String[] args) {
        StringList testList = new StringList(3);
        testList.set(0,"One");
        testList.set(1,"Two");
        testList.set(2,"Three");
        System.out.println(testList);
        testList.add("Four");
        testList.remove("Two");
        System.out.println(testList);
        testList.insert(1, "Test");
        System.out.println(testList);
        System.out.println(testList.size());
        System.out.println(testList.get(0));
        System.out.println(testList.find("Four"));
    }
}

/*Output:
run:
One, Two, Three
One, Three, Four
One, Test, Three, Four
4
One
3
BUILD SUCCESSFUL (total time: 0 seconds)
*/