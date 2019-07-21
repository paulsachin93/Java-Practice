class Studentx
{
String name;
int age;
void setname(String name)
{
this.name=name;
}
public String getname()
{
return name;
}
void setage(int age)
{
this.age=age;
}
public static void main(String args[])
{
Studentx s = new Studentx();
s.setname("Skrillex");
s.setage(22);

System.out.println( s.getname() );
System.out.println( s.getage() );
}
}