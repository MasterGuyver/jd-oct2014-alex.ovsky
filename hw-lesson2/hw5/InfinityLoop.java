package hw5;

public class InfinityLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers(3,4);
	}
	static void printNumbers(int i, int n) {
		while(i<n) {
			n+=2;
			i++;
		System.out.println("Number i: "+i+". "+"Number n:"+n+".");
		}
	}
}
