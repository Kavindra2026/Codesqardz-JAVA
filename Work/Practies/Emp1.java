public class Emp1
{
 static String cname="TCS";
 String name;
 int salaey;
 void get(String s1, int s2)
 {
   name=s1;
   salaey=s2;
 }
 void show(){
 System.out.println(cname);
 System.out.println(name);
 System.out.println(salaey);
 }
 static int add(int a, int b)
 {
 return a+b;
 }
 public static void main( String s[])
 {
 Emp1 e1=new Emp1();
 System.out.println(e1.hashCode());
 System.out.println(e1);
 e1.name="Lalu";
 System.out.println(e1.name);
 Emp1 e2 =e1;
 System.out.println(e2);
 e2.name="Bhalu";
 System.out.println(e1.name);
 }
}
