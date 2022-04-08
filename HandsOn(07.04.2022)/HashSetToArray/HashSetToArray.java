package HandsOn;
import java.util.*;
class HashSetToArray 
{
  public static void main(String[] args) {
	  HashSet<String> h = new HashSet<String>();
	  h.add("BMW");
	  h.add("Audi");
	  h.add("Benz");
	  h.add("Verna");
      h.add("Polo");
      h.add("Baleno");
      String[] a = new String[h.size()];
      h.toArray(a);
      for(String s : a)
    	  System.out.println(s);
   }
}


