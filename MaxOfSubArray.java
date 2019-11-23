package achievers;

import java.util.Scanner;

public class MaxOfSubArray {
	static int count = 0;
	static void SubArray(int ar[],int n, int k) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				max(ar,i,j,k);
			}
		}
		System.out.println("max element of every subarray greater than "+k+" are "+count);
	}
	
	static int max(int ar[],int a,int b,int k) {
		
		int m=ar[a];
		for(int i=a;i<=b;i++) {
			if(ar[i]>m)
				m=ar[i];
		}
		if(m>k)
			count++;
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		SubArray(ar,n,k);
	}

}
