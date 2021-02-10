package internshippractise;

import java.util.ArrayList;
public class MyArrayList {
    public static void main(String args[])
    {
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> veg = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println(fruits);
        
        System.out.println(fruits.get(2));
        fruits.set(2, "Grapes");
        veg.add("Potato");
        veg.add("Tomato");
        veg.add("Carrot");
        
        fruits.addAll(veg);
        System.out.println(fruits);
        
        veg.remove(1);
        System.out.println(veg);
        System.out.println(veg.size());
        
        System.out.println(veg.contains("Guava"));
    }
}
