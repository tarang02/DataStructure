package achievers;

import java.util.Scanner;

public class ReverseStringSpecial {
	
	static String reverseString(String str) {
		
		char ch[] = str.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j) {
			while(!((ch[i]>='A'&&ch[i]<='Z')||(ch[i]>='a'&&ch[i]<='z')) && i<j) 
			{
				i++;
			}
			while(!((ch[j]>='A'&&ch[j]<='Z')||(ch[j]>='a'&&ch[j]<='z')) && j>i) 
			{
				j--;
			}
			if(i<j) {
				char c=ch[i];
				ch[i]=ch[j];
				ch[j]=c;
				i++;
				j--;
			}
			
		}
		str=new String(ch);
		return str;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(reverseString(str));
		
	}
}
