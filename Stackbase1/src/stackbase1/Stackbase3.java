/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackbase1;

import java.util.*;

/**
 *
 * @author Admin
 */
public class Stackbase3 {
    
    public static void main(String[] args){
        
   
    Stack sk = new Stack();
    
    Methodsofstack m1 = new Methodsofstack();
    
    m1.add(sk,"Hello");
     m1.add(sk,"hi");
      m1.add(sk,"Kem cho");
      m1.print_for_each(sk);
      }
    
    
}

class Methodsofstack{
    void print_for_each(Stack sk){
        sk.forEach( n -> {
            System.out.println(n);
        });
    }
    
     void add(Stack st, String h){
        System.out.println("Push ->" + h);
        st.push(h);
        System.out.println("New Stack" + st);
        
    }
}
