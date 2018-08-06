import java.io.*;
import java util.*;
class Greater
{
public static void main(String args[])
{
System.out.println("enter the values of  a,b,c");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b&&a>c)
{
System.out.println(a);
else if(b>a&&b>c)
System.out.pritln(b);
else
System.out.pritln(c);
}
}
}

