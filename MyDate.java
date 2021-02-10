package internshippractise;

import java.util.*; 
import java.time.*; 
  
public class MyDate 
{ 
    public static void main(String[] args) 
    { 
        // Creating date 
        Date d1 = new Date(2000, 11, 21); 
        Date d2 = new Date();  
        Date d3 = new Date(2010, 1, 3); 
  
        boolean a = d3.after(d1); 
        System.out.println(a); 
  
        boolean b = d3.before(d2); 
        System.out.println(b); 
  
        int c = d1.compareTo(d2); 
        System.out.println(c); 
  
        LocalDate ld = LocalDate.now(); 
    System.out.println(ld);
    }
}