abstract class ElectronicDevice
{
public void turn on();
public void turn off();
public void get();
{
System.out.println("this is get method");
}
public class Television extends ElectronicDevice
{
public void turn on()
{
System.out.println("TURN ON");
}
public void turn off()
{
System.out.println("TURN OFF");
}
public static void main(String args[])
{
ElectronicDevice e = new Television();
e.turn on();
e.turn off();
e.get();
}
}