package internshippractise;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 */
import java.util.Scanner;

public class MyExceptions {
 public static void main(String args[])
 {
     try{
     Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     int y = sc.nextInt();
     System.out.println(x/y);
     }
     catch(ArithmeticException e)
     {
         System.out.println(e);
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     finally
     {
         System.out.println("Code Is running successfully.");
     }
 }
}
