package achievers;

import java.util.Scanner;

public class sumOfSubArray {
	
	static void SubArraySum(int n,int ar[], int k) {
		int sum=0;
		Boolean flag = false;
		for(int i=0;i<n;i++) {
			sum=0;
			for(int j=i;j<n;j++) {
				sum+=ar[j];
				if(sum==k) {
					System.out.println("Starting index : "+i+", Ending index : "+j);
					flag=true;
					break;
				}
			}
		}
		if(flag==false) {
			System.out.println("sum equal to "+k+" not found in any sub array");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter values in array");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter any number");
		int k=sc.nextInt();
		SubArraySum(n, ar, k);
		
	}

}
