
import java.lang.*;
import java.io.*;
import java.util.*;

class Program3
{

public static void main(String args[])
{
 double dollar, pound, euro, rupee;
Scanner s = new Scanner (System.in);
System.out.println("1. Rupee");
System.out.println("2. Dollars");
System.out.println("3. Pounds");
System.out.println("4. Euros");
System.out.println("5. EXIT");
System.out.println("\n\nEnter your choice");
int ch = s.nextInt();
System.out.println("Enter the amount as per your wish:");
 double a = s.nextDouble();
switch(ch)
{
case 1:
  dollar = a/82.70 ;
System.out.println(a+" Rupees = "+dollar+"\n");

  pound = a/99.43 ;
System.out.println(a+" Rupees = "+pound+"\n");

  euro = a/87.68 ;
System.out.println(a+" Rupees = "+euro+"\n");

break;

case 2:
  rupee = a*82.70 ;
System.out.println(a+" Dollar = "+rupee+"\n");

  pound = a*0.83 ;
System.out.println(a+" Dollar = "+pound+"\n");

  euro = a*0.94;
System.out.println(a+" Dollar = "+euro+"\n");

break;

case 3:
  rupee = a*99.43 ;
System.out.println(a+" Pounds = "+rupee+"\n");

  dollar = a*1.20 ;
System.out.println(a+" Pounds = "+dollar+"\n");

  euro = a*1.14 ;
System.out.println(a+" Pounds = "+euro+"\n");

break;

case 4:
  rupee = a*87.68 ;
System.out.println(a+" Euros = "+rupee+"\n");

  dollar = a*1.06 ;
System.out.println(a+" Euros = "+dollar+"\n");

  pound = a*0.88 ;
System.out.println(a+" Euros = "+pound+"\n");

break;

case 5:
System.exit(0);
break;

default:
System.out.println("Invalalid Input");

}
}
}