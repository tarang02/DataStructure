package achievers;

public class MaxOfSubArray {
	static int count = 0;
	static void SubArray(int ar[],int n, int k) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				max(ar,i,j,k);
			}
		}
		System.out.println(count);
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
		int ar[] = {1,2,3,4};
		SubArray(ar, 4 , 2);
	}

}
