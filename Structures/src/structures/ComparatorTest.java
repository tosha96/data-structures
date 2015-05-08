/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Tosha
 */
public class ComparatorTest {
    public static void main() {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(6);
        ints.add(3);
        ints.add(4);
        Collections.sort(ints, new Comparator() {
            @Override
            public int compare(int i1, int i2) {
                return i1 - i2;
            }

            @Override
            public int compare(Object o1, Object o2) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }


        });
    }
}
