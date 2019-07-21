class Emmployee
{
int s=0;
void sum(int a)
{
s=s+a;
}
}
class Manager extends Emmployee
{
void sum(int d)
{
int a=10,b=20,c;
c=a+b;
System.out.println(c);
}
public static void main(String args[])
{
Manager m= new Manager();
m.sum(34);
}
}