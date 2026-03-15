import java.util.*;
public class PrimeNo{
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int count=0;
if(a==1){
System.out.println(a+" is a prime no");}
else{
for(int i=1;i<=a;i++){
if (a%i==0){
count++;}
if(count==2){
System.out.println(a+" is a prime no");}
else{
System.out.println(a+" is not a prime no");}}
}}}