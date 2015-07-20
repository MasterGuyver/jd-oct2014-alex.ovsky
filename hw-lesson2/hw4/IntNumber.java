package hw4;

public class IntNumber {

	public static void main(String[] args) {
		start(7);

	}
	static void start(int number) {
		if(number < 0) {
			System.out.println("Start failed");
		}
		else {
			while(number >= 0) {
				System.out.print(number--+" ");
			}
		System.out.println("Go!");	
		}
		return;
	}
}
