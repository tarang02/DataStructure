package achievers;

import java.util.Stack;

public class Balnced_Paranthesis {
	static Stack<Character> s = new Stack<>(); 
	static void check_paranthesis(String str) {
		Boolean flag = true;
		char []ch = str.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if(s.isEmpty()) {
				s.push(ch[i]);
			}
			else if(ch[i]=='[' || ch[i]=='{' || ch[i]=='(') {
				s.push(ch[i]);
			}
			else if(ch[i]==']' && s.peek()=='[') {
				s.pop();
			}
			else if(ch[i]=='}' && s.peek()=='{') {
				s.pop();
			}
			else if(ch[i]==')' && s.peek()=='(') {
				s.pop();
			}
			else {
				System.out.println("Not Balanced");
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Balanced");
		}
	}
	
	public static void main(String[] args) {
		String str= "[{()}]()";
		String str1 = "[{]()";
		check_paranthesis(str);
		check_paranthesis(str1);
	}

}
