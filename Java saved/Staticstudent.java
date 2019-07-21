class Staticstudent
{
String name;
static String proffesion="DJing";
void display()
{
System.out.println("Name is:"+name);
System.out.println("Proffesion is:"+proffesion);
}
public static void main(String args[])
{
Staticstudent s1 = new Staticstudent();
Staticstudent s2 = new Staticstudent();

s1.name = "PAUL";
s2.name = "SKRILLEX";

s1.proffesion = "Vh1Supersonic";

s1.display();
s2.display();
}
}