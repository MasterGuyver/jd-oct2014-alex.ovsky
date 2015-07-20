package hw4;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		System.out.println(factorial(-3));
	}
static long factorial(int i) {
	long prod = 1;
	if(i>0) 
		for(int k=1; k<=i; k++)
			prod *= k;
	if(i<0) System.out.println("Non positive number!");
	return prod;
}
}