package achievers;

import java.util.Scanner;

public class MaxSubArray {
	
	static void maxSubArray(int ar[],int a) {
		int max;
		for(int i=0;i<ar.length-a+1;i++) {
			max=ar[i];
			for(int j=i;j<a+i;j++) {
				if(max<ar[j])
					max=ar[j];
			}
			System.out.println(max);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		maxSubArray(ar, a);
	}
	
}
