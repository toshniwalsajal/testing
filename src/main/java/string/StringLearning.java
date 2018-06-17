package string;

public class StringLearning {

	public static void main(java.lang.String[] args) {

		String txt="Success";
		int j=0;
		char[] charArray = txt.toCharArray();
		int length = txt.length();
		for (int i = length-1; i>0 ; i--) {
			char charAt = txt.charAt(i);
			System.out.println(charAt);
		}
		
		for(int i=0;i<length;i++) {
	 		if(txt.charAt(i)=='e') {
				j++;
			}
			
		}
		System.out.println(j);
	
		
	}

}
