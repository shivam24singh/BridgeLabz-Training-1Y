import java.util.*;
public class UpdateElement {
public static void main (String[] args) {
//Scanner sc = new Scanner(System.in);
int a[] = {12,13,14,15,16};
System.out.println("Array elements : ");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);}

a[3]=100;
System.out.println("New array elements : ");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);}
}}