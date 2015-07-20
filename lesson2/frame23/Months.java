package frame23;


public class Months {

	public static void main(String[] args) {
		System.out.println(isSpring(4));
		System.out.println(isSpring(2));
		System.out.println(isSpring(0));
	}
	static int isSpring(int month) {
		if(month >2 && month <6) return 1;
		if(month >0 && month <3 || month>5 && month<13) return 0;
		return -1;
	}
}
