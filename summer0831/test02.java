package summer0831;

import java.util.*;

public class test02 {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize();
        System.out.println("After trimToSize()");
        print(v);
        System.out.println();

        v.ensureCapacity(6); //기본적으로 2배를 늘려준다.
        System.out.println("AfterEnsureCapacity()");
        print(v);
        System.out.println();

        v.setSize(7);
        System.out.println("After setSize(7)");
        print(v);
        System.out.println();

        v.clear();
        System.out.println("After clear()");
        print(v);
        System.out.println();

    }
    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());
    }
}
