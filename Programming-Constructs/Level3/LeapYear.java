import java.util.*;
public class LeapYear{
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if(a>=1582){
if(a%4==0&&a%100!=0||a%400==0){
System.out.println("Its a leap year");}
else{
System.out.println("Its not a leap year");}
}}}