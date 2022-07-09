package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(Integer.valueOf("10"));
        list.add(Integer.valueOf("50"));
        list.add(Integer.valueOf("30"));
        list.add(Integer.valueOf("60"));
        list.add(Integer.valueOf("20"));
        list.add(Integer.valueOf("90"));
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
