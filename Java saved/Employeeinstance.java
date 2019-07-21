class Employeeinstance
{
void get()
{
System.out.println("this is get method of Employee class");
}
class Manager extends Employeeinstance
{
void get()
{
System.out.println("this is get method of Manager class");
}
public static void main(String args[])
{
Employeeinstance e = new Employeeinstance();
Manager m = new Manager();

if(e instanceof Manager)
	{
	System.out.println("m instance of Employee");
	{
	m.get();
	}

if(m instanceof Manager)
	{
	m.get();
	}
}
}