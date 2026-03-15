import java.util.*;
public class Array2DUserInputSum{
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int [][] marks  = new int[a][b];
for(int i = 0;i<a;i++){
for (int j = 0;j<b;j++){
marks[i][j]=sc.nextInt();}}
int sum = 0;
for(int i = 0;i<a;i++){
for (int j = 0;j<b;j++){
sum = sum + marks[i][j];}}
System.out.println("Sum of elements : "+sum);
}}