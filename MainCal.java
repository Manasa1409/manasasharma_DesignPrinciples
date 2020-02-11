import java.util.Scanner;
import java.io.*;

class Calculator{
		  double x;
		  double y;
	public Calculator(double x,double y)
{
	this.x=x;
        this.y=y;
}
       public double addition()
{       
     return(x+y);
}
        public double subtraction()
{       
        return(x-y);
}
         public double multiplication()
{       
        return(x*y);
}
        public double division()
{       
      return(x/y);
}
}

class MainCal{
     public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	char operator;
	double result;
	result=0.0;
	System.out.println("enter the operation you wish to perform");
	operator=sc.next().charAt(0);
	Calculator c=new Calculator(10.23,15.34);
	switch(operator)
	{
		case '+': result=c.addition();
  		break;
		
		case '-': result=c.subtraction();
  		break;

		case '*': result=c.multiplication();
  		break;

		case '/': result=c.division();
  		break;
		
		default: System.out.println("\n Wrong choice");
}
	System.out.println("result of"+operator +" = "+result);
}
}
    		