class Studenty
{
void display()
{
System.out.println("display method");
}
void display(int a)
{
System.out.println(a);
}
void display(int a,int b)
{
System.out.println(a,b);
}
public static void main(String args[])
{
Studenty s = new Studenty();
s.display();
s.display(56);
s.display(45,30);
}
}