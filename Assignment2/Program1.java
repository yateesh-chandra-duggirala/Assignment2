import java.util.*;
import java.io.*;
import java.util.*;


class Program1
{
public double si(double p, double t, double r)
{
double i = p*t*r/100;
return i;
}

public double ci(double p, double t, double r)

{
//ci = p(1-(r/100))^t

double j = 1-(r/100);
double n = Math.pow(j,t);
double c = p*n;
return c;
}

public static void main(String args[])
{
Scanner s= new Scanner(System.in);
Program1 sol = new Program1();
System.out.println("Enter the Principal amount:");
double p = s.nextDouble();
System.out.println("Enter the time:");
double t = s.nextDouble();
System.out.println("Enter the Rate of Interest:");
double r = s.nextDouble();

System.out.println("The Simple Interest is : "+sol.si(p,t,r));
System.out.println("The Compound Interest is : "+sol.ci(p,t,r));
}
}