package hunter.set6;

import java.util.Scanner;

public class P58 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Size of array: ");
		int size=in.nextInt();
		int[] array=new int[size];
		System.out.println("Array elements : ");
		for(int i=0;i<size;i++){
			array[i]=in.nextInt();
		}
		System.out.println("diiference between two elements will be : ");
		int k=in.nextInt();
		int count=0;
		for(int i=0;i<size-1;i++){
			for(int j=i+1;j<size;j++){
				if(k==(int)Math.abs(array[i]-array[j])){
					count++;
				}
			}
		}
		if(count!=0){
			System.out.println("Posiible pairs : "+count);
		}else{
			System.out.println("Ther is no posiible pairs ");
		}in.close();
	}

}
