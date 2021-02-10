package internshippractise;

public class MyStringBuilder
{  
    public static void main(String args[]){  
    StringBuilder sb=new StringBuilder("Hello ");  
    sb.append("Java");  
    sb.insert(1,"Java");
    System.out.println(sb);
    
    StringBuilder sb1=new StringBuilder("Hello");  
    sb1.replace(1,4,"world");  
    System.out.println(sb1);
    
    sb1.delete(1,3);
    System.out.println(sb1);
    
    StringBuilder sb2=new StringBuilder("Abhishek");  
    sb2.reverse();  
    System.out.println(sb2);
}  
}