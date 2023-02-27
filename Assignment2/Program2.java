import java.lang.*;
import java.io.*;
import java.util.*;

class Program2
{
public static void main (String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of the array:");
int n = s.nextInt();
int a[]= new int[n];
System.out.println("Enter the Elements into the array");
for (int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
System.out.println("The Second largest Array "+a[n-2]);
}
}

