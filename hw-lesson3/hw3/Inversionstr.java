package hw3;

public class Inversionstr {

	public static void main(String[] args) {
		String a = "Systems";
		a = "System Brain";
		System.out.println(inverse(a));
	}
	
static String inverse(String str) {
	if(str!=null) {
	char[] tmp=str.toCharArray();
	for(int i = str.length()-1;i>=0;i--) {
	tmp[i] = str.toCharArray()[str.length()-1-i];	
	}
	return new String(tmp);
	}
	return str;	
}
}
