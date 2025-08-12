import java.util.Scanner;
public class soru
{
public static void main(String[]args)
{
Scanner menu=new Scanner(System.in);
System.out.println("Welcome to ammu restaurant");
System.out.println("Enter your choice");
System.out.println("a.Breakfast");
System.out.println("b.Lunch");
System.out.println("c.Dinner");
System.out.println("Enter a, b or c");
String choice=menu.nextLine();
if(choice.equals("a"))
{
    System.out.println("Here are your dishes");
System.out.println("a.Dosa");
System.out.println("b.Puri");
System.out.println("c.Pongal");
System.out.println("Please text what you like to order");
String breakfast=menu.nextLine();
System.out.println("Your order is ready "+breakfast);
}
else if(choice.equals("b"))
{
    System.out.println("Here are your dishes");
System.out.println("1.Briyani");
System.out.println("2.Nooodles");
System.out.println("3.Rice");
System.out.println("Please text what you like to order");
String lunch=menu.nextLine();
System.out.println("Your order is ready "+lunch);
}
else
{
    System.out.println("Here are your dishes");
System.out.println("1.naan");
System.out.println("2.Parotta");
System.out.println("3.Manchurian");
System.out.println("Please text what you like order");
String dinner=menu.nextLine();
System.out.println("your order is ready "+dinner);
}
//System.out.println("Your food is ready");
System.out.println("Thank you for coming");
}
}

