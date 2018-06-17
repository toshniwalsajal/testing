package string;

public class CommonChars {

	public static void main(java.lang.String[] args) {
		String txt1="failurec";
		String txt2="Successb";
		StringBuffer buffer1=new StringBuffer(txt1);
		StringBuffer buffer2=new StringBuffer(txt2);
		for(int i=0;i<buffer1.length();i++) {
			for(int j=0;j<buffer2.length();) {
				if(buffer1.charAt(i)==buffer2.charAt(j)) {
					 buffer2.deleteCharAt(j);
					 
					//System.out.println(deleteCharAt);
				}
				else
				{
					j++;
				}
				
			}
			
		}
		System.out.println(buffer2);
		
	}

}
