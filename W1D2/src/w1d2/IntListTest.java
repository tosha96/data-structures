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
public class IntListTest {
    public static void main(String[] args) {
        IntList testList = new IntList();
        testList.add(8);
        testList.add(9);
        System.out.println(testList);
        testList.clear();
        
        testList.add(3);
        testList.add(4);
        testList.add(4);
        testList.add(6);
        testList.add(3);
        
        testList.removeDuplicates();
        System.out.println(testList);
        
        testList.generateRandom(10);
        System.out.println(testList);
        
        System.out.println(testList.getSublist(4,7));
        
    }
}

/*Output:
run:
8, 9
3, 4, 6
3, 4, 6, 94, 14, 2, 71, 71, 72, 26, 70, 81, 54
14, 2, 71, 71
BUILD SUCCESSFUL (total time: 0 seconds)
*/
