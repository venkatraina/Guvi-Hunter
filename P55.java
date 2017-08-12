package hunter.set6;

import java.util.Scanner;

public class P55 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = in.nextInt();
		int[] num = new int[ n ];
		System.out.println("Enter the elements : ");
		for(int i = 0 ; i < n ; i++){
			num [ i ] = in.nextInt();
		}
		System.out.println("Enter the rotations required :");
		int d= in.nextInt();
		for(int i = 0 ; i < d ; i++){
			int first = num [ 0 ];
			for(int j = 0 ; j < n - 1 ; j++){
				num [ j ] = num [ j + 1 ];
			}
			num[ num.length - 1 ] = first;
		}for(int i : num){
			System.out.print( i + " ");
		}in.close();

	}

}
