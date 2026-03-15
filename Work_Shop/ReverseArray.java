import java.util.*;
public class ReverseArray {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int []arr = new int[a];
for (int i=0;i<a;i++){
arr[i]=sc.nextInt();}
for (int j = a-1;j>=0;j--){
System.out.println(arr[j]);}
}}