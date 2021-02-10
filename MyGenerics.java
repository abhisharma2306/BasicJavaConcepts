package internshippractise;

import java.util.ArrayList;

public class MyGenerics {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(50);
    numbers.add(90);
    numbers.add(80);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n*n); } );
  }
}