class EmployeeExample
{
void get()
{
System.out.println("this is get method of Employee class");
}

class Manager extends EmployeeExample
{
void get()
{
System.out.println("this is get method of Manager class");
}
public static void main(String args[])
{
EmployeeExample e = new Manager();
e.get();
}
}
