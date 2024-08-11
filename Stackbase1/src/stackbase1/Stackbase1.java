
package stackbase1;
import java.util.*;
public class Stackbase1 {

    
    public static void main(String[] args) {
       Stack<Integer> stac = new Stack<>();
       
       stac.push(5);
       stac.push(15);
       stac.push(25);
       stac.push(55);
       
//       while(!stac.empty()){
//           System.out.println(stac.pop());
//       }
       System.out.println(stac.peek());
       System.out.println(stac.search(55));
    }
    
}
