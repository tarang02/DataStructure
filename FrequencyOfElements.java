package achievers;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfElements {
	
	static void countFrequency(int ar[], int n) {
		int count =0;
		boolean[] flag = new boolean[ar.length];
		Arrays.fill(flag, false);
		for(int i=0;i<n;i++) {
			count =0;
			for(int j=i;j<n;j++) {
				if(ar[i]==ar[j] && flag[j]==false) {
					flag[j]=true;
					count++;
				}
			}
			if(count>0)
				System.out.println("frequency of "+ar[i]+" is : "+count);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n =sc.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		countFrequency(ar,n);
		
	}

}
