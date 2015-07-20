package frame21;


public class Minimuma {

	public static void main(String[] args) {
		System.out.println(min(4,2,4));
	}
	static int min(int a,int b,int c) {
		if(a<=b) {if(a<=c) {return a; } }
		else if(b<=c) if(b<=a) {return b;}
		return c;
	}
}
