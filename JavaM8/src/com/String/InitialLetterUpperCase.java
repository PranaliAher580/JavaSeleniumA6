package com.String;

public class InitialLetterUpperCase {
   public static void main(String[] args) {
	   String s= " JAVA is a pROGraming LangUAgE";
	   s=s.toLowerCase();
	   String s1[] = s.split(" ");
	   String s2="";
	   
	   for (int i=0;i<s1.length;i++) {
		   s2=s2+(char)(s1[i].charAt(0)-32)+s1[i].substring(1)+" ";
		   	
	   }
	   s2=s2
	
	
}
}
