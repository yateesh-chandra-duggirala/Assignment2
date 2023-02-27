import java.lang.*;
import java.io.*;
import java.util.*;

class Program4
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the values of a, b, c:");
int a = s.nextInt();
int b = s.nextInt();
int c = s.nextInt();

if(a>c)
{
if(a>b)
{
System.out.println("a is large");
}
else

{
System.out.println("b is large");
}
}
else
{
if (b>c)
{
System.out.println("b is large");
}
else
{
System.out.println("c is large");
}
}
}
}