import java.util.*;
class WrongAge extends Exception
{

public String toString()
{
return "Exception--Invalid Age ";
}
}
class Father
{
int father_age;
Father(int a) throws WrongAge
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age of Father's:");
father_age=sc.nextInt();
if(father_age<=a||father_age<0||a<0)
{
throw new WrongAge();
}
}
}
class Son extends Father
{
int son_age;
Son(int a) throws WrongAge
{
super(a);
son_age=a;
}
}
public class Main
{
public static void main(String Args[])
{
System.out.println("Enter the age of son's:");
try
{
Son s1=new Son(new Scanner(System.in).nextInt());
}
catch(WrongAge e)
{
System.out.println(e);
}
}
}
