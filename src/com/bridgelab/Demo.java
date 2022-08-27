package com.bridgelab;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer>num = new ArrayList<>();
        num.add(35);
        num.add(40);
        num.add(39);
        num.add(49);
        Iterator itr= num.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for(int i : num){
            System.out.println(i);
        }
    }
}
