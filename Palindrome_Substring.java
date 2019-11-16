package achievers;

import java.util.Scanner;

public class Palindrome_Substring {
	
	static void Substring(String str) {
		String s = "";
		char ch[] = str.toCharArray();
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i+1;j<str.length()-1;j++) {
				if(check_palindrome(i,j,ch)) {
					String sub = str.substring(i,j+1);
					if(sub.length()>s.length()) {
						s=sub;
					}
				}
			}
		}
		if(s.length()==0) {
			System.out.println("No substring exist");
		}
		else
			System.out.println("Longest substring is "+ s);
	}
	
	static Boolean check_palindrome(int start,int end, char ch[]) {
		int j=0;
		for(int i=start;i<=end;i++) {
			if(ch[i]!=ch[end-j]) {
				return false;
			}
			j++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Substring(str);
	}
	
}
