import java.util.*;
public class Temparature
{
	public static void main(String arg[])	
	{
	    double a,b,c;
        Scanner sc=new Scanner (System.in)	;   	 
	    System.out.println("Enter  Fahrenheit temperature");
                   a=sc.nextDouble(); 
	    System.out.println("Celsius temperature is = "+celsius(a));	
        System.out.println("Enter  celcius temperature");
                   b=sc.nextDouble(); 
	    System.out.println("Fahrenheit temperature is = "+fahrenheit(b));			
	} 
	static double celsius(double f)
	{	
	return  (f-32)*5/9;
	}
	static double fahrenheit(double c)
	{	
	return  (c * 9/5) + 32;
	}
}