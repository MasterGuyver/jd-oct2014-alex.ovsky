package hw1;

public class Findinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = {5,-3,6.0,8.0,67,3};
	System.out.println(findElement(a,67));
	System.out.println(findElement(a,7));
	}
	static int findElement(double[] numbers, double el) {
		if(numbers!=null) 
		for(int i=0;i<numbers.length;i++)
			if(numbers[i]==el) return i;
		return -1;
	}
}