import java.util.Scanner;
class Array_sum{
     public static void main(){
	 int sum =0;
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[]arr=new int[n];
	  for(int i=0;i<n;i++){
	      arr[i]=sc.nextInt();
		  }
		  for(int i:arr){
		      sum+=i;
		  }
		  System.out.println(sum);
		  }
		  }