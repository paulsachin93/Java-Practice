class Employeee
{
int empid;
String name;
Employeee(int empid,String name)
{
this.empid=empid;
this.name=name;
}
}
class Manager extends Employeee
{
String depname;
Manager(int empid,String name,String depname)
{
super(empid,name);
this.depname=depname;
}
void display()
{
System.out.println("Employee id : "+empid);
System.out.println("Name is : "+name);
System.out.println("Department name is : "+depname);
}

public static void main(String args[])
{
Manager m=new Manager(10,"paul","Accout");
m.display();
}
}