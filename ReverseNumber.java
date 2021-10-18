import java.util.*;
public class ReverseNumber   
{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number : ");
  int n=sc.nextInt();
int Reverse = 0;  
while(n != 0)   
{  
int Remainder = n % 10;  
Reverse = Reverse * 10 + Remainder;  
n = n/10;  
}  
System.out.println("The reverse of the given number is: " + Reverse);  
}  
}