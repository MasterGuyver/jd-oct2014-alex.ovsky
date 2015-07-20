package frame17;


public class Ages {

	public static void main(String[] args) {
		System.out.println(oldEnough(25));
		System.out.println(oldEnough(19));
	}
	static boolean oldEnough(int age) {
	if(age >= 21) return true;
	return false;
	}
}
