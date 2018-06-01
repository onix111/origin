/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;
import java.util.ListIterator;

class UsingStaticClass {
    // статические переменные
    static int a = 2;
    static int b;
    
    // статический блок
    static {
        b = a * 2;
    }
    
    // статический метод
    static void someMethod(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);        
    }
    
    static void someMethod(int x, int k) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);     
    }
}

public class test {
    public static void main(String[] args) {
      ArrayList<Integer> arr = new ArrayList<Integer>();
      arr.add(1);
      arr.add(2);
      arr.add(3);
      
      Integer ai[] = new Integer[arr.size()];
      arr.toArray(ai);
      for (int i : ai)
        System.out.println(i);
      
      ListIterator<Integer> litr = arr.listIterator();
      while(litr.hasNext()){
          System.out.println(litr.next());
      }
      
      while(litr.hasPrevious()){
          System.out.println(litr.previous());
      }
    }
}
