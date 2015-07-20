package frame32;


public class While_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
			if(i<11) continue;
			else 
			break;
		}
	}

}
