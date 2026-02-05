package com.String;

public class RemoveDuplicate {
      public static void main(String[] args) {
		String s= " MALAYALAM";
		
		char ch[]=s.toCharArray();
	 
	 char[] s1;
	 for (int i=0;i<ch.length;i++) {
	     for (int j=i+1;j<ch.length;j++) {
	    	 if (ch[i]==ch[j]) {
	    		  ch[j]=' ';
	    	 }
	     }
	     if(ch[i]!=' ') {
	   	 s1=s1+ch[i]; 
	    	 }
	      }
	 System.out.println(s1);
	}
}
