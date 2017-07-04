package guvi;

import java.util.Scanner;

public class HighSumOfSubArray {

	public static void main(String[] args) {
		System.out.println("Enter the size of Array:");
		int n;
		int sum=0;
		int sum1=0;
		int mark=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		String[] s=new String[n];
         int[] a=new int[n];
         System.out.println("Enter the elements in the array:");
         for(int i=0;i<a.length;i++){
        	 s[i]=in.next();
        	 a[i]=Integer.parseInt(s[i]);
         }for(int k=0;k<=a.length-3;k++){
        	 for(int j=k;j<=a.length-3;j++){
            	 sum1=a[j]+a[j+1]+a[j+2];
            	 if(sum<sum1||sum==sum1){
            		 sum=sum1;
            		 mark=k;
            	 }
             }
         }
         System.out.println("The sub array with maximum sum is:");
         for(int i=mark;i<=mark+2;i++){
        	 System.out.print(a[i]+" ");
         }in.close();

	}

}
