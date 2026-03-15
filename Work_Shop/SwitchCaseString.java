import java.util.*;
public class SwitchCaseString{
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
String i = sc.nextLine();
switch (i){ // i is weekdays
case "a":
System.out.println("Sunday");
break;
case "b":`
System.out.println("Monday");
break;
case "c":
System.out.println("Tuesday");
break;
case "d":
System.out.println("Wednesday");
break;
case "e":
System.out.println("Thursday");
break;
case "f":
System.out.println("Friday");
break;
case "g":
System.out.println("Saturday");
break;
default:
System.out.println("Invalid ");
}}}