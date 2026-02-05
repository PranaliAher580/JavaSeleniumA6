package com.String;

public class Reverse {
	public static void main(String[] args) {
		String s= "Java Is A Programming Language ";
		String [] s1=s.split(" ");
		String s2="";
		
		for (int i=s1.length-1;i>=0;i--) {
			s2=s2+s1[i]+" ";
			}
		s2=s2.trim();
		System.out.println(s2);
	}

}
