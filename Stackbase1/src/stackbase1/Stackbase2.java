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
public class Stackbase2 {
   public static void main(String[] args){
    Stack sk = new Stack();
    Base b1 = new Base();
   for(int i = 0; i<=150; i++){
        b1.add(sk,i);
   }
   for(int i = 0; i<=150; i++){
     try{
       b1.popp(sk);
     }catch(Exception e){
         System.out.println("String is Empty");
     }
   }
   }
}


class Base{
    
    
    void add(Stack st, int h){
        System.out.println("Push ->" + h);
        st.push(h);
        System.out.println("New Stack" + st);
        
    }
    
    void popp(Stack stk){
        
        stk.pop();
          System.out.println("New Stack" + stk);
    }
    
}
