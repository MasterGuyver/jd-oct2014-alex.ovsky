package frame19;


public class Minimalka {

	public static void main(String[] args) {
		System.out.println(min(5,-2,0));
	}
	static int min(int a,int b,int c) {
		int min = a;
		if(min>b) min = b;
		else if(min>c) min = c;
		return min;
	}
}
