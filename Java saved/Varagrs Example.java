class Varargs Example
{
static void display(String...values)
{
System.out.println("display method invoked");

	for(String s:values)
	{
	System.out.println(s);
	}
}

public static void main(String args[])
{
display();
display("hello");
display("MY","NAME","IS","SKRILLEX");
}
}