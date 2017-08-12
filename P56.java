package hunter.set6;

import java.util.Scanner;

public class P56 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int mark1=0;
		int mark2=0;
		int sum1=arr[0]+arr[1];
		for(int i=1;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				int sum=arr[i]+arr[j];
				if(sum1<0&&sum<0){
					if(sum>sum1){
						sum1=sum;
						mark1=arr[i];
						mark2=arr[j];
					}
				}else{
					if(sum>=0&&sum<sum1){
						sum1=sum;
						mark1=arr[i];
						mark2=arr[j];
					}
				}
			}
		
		}
		System.out.println("Minimum absolute sum pair is: ["+mark1+" "+mark2+"]");
        in.close();
	}

}
