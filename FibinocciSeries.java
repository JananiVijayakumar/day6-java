import java.util.*;
public class FibinocciSeries {  
public static void main(String[] args)  
{ 
Scanner sc=new Scanner(System.in);   
  System.out.println("enter n1 :");
 int n1=sc.nextInt();
 System.out.println("enter n2 :");
 int n2=sc.nextInt();
 System.out.println("enter count :");
 int count=sc.nextInt();
 int i;  
int n3; 
 System.out.print(n1+" "+n2);   
    
 for(i=2;i<count;++i)    
 {    
  n3=(n1+n2);    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  