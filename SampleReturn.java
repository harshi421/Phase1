import java.util.Scanner;
public class Sample 
{ 
  int m1()
  { 
   System.out.println("method_1") ;
      return 20; 
} 
  float m2() 
  { 
    System.out.println("method_2"); 
      return 20.5f; 
  } 
  static char m3()
  { 
    System.out.println("method_3"); 
     return 'd'; 
  } 
double m4() 
{
System.out.println("method_4"); 
return 20.5d;
}
static String m5() 
{
  System.out.println("method_5"); 
    return "method_5";
}
long m6() 
{
 System.out.println("m6 method"); 
 return 10000;
}
public static void main(String[] args)
 { 
    Sample s = new Sample();
    int x = s.m1(); 
    System.out.println("Return value of m1()= " +x); 
    float y = s.m2();
    System.out.println("Return value of m2()= " +y); 
    char ch = Sample.m3(); 
    System.out.println("Return value of m3()= " +ch); 
double d1 = s.m4() ;
System.out.println("Return value of m4()= " +d1); 
String str = s.m5() ;
System.out.println("Return value of m5()= " +str); 
long l = s.m6() ;
System.out.println("Return value of m6()= " +l); 
  } 
 }