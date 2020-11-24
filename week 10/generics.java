import java.util.*;
class TwoGen<A,B>
{
 A ob1;
 B ob2;
 
 TwoGen(A o1,B o2)
 {
  ob1=o1;
  ob2=o2;
 }
 void showtypes()
 {
  System.out.println("Type 1:\n"+ob1.getClass().getName());
  System.out.println("Type 2:\n"+ob2.getClass().getName());
 }
 A getob1()
 {
  return ob1;
 }
 B getob2()
 {
  return ob2;
 }
}
public class Main
{
 public static void main(String args[])
 {
  TwoGen<Integer,String> obj=new TwoGen<Integer,String>(20,"Genrics");
  obj.showtypes();
  int t=obj.getob1();
  System.out.println("Value of Type 1 = "+t);
  String str=obj.getob2();
  System.out.println("Value of Type 2 = "+str);
 }
}

