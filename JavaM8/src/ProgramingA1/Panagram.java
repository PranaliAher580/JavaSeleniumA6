package ProgramingA1;

public class Panagram {
	public static void main(String[] args) {
		String s= " The Quick Brown Fox Jumps Over The Lazy Dog";
		if (s.length()>=26) {
			s=s.toLowerCase();
			char ch[]=s.toCharArray();
			for (int i=0;i<ch.length;i++) {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						ch[j]=' ';
						
					}
				}
			}
			int count=0;
			for(int i=0;i<ch.length;i++) {
				ifch[i]>='a'&&ch[i]<='z'&&ch[i]!=' ') {
					count++;
				}
			}
			System.out.println(count);
			if(count==26) {
				
			}
			
			
		}
	}

}
